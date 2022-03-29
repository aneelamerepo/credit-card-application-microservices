package creditcard.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import creditcard.dao.jpa.CardRepository;
import creditcard.domain.Card;
import creditcard.exception.CardNotFoundException;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This Controler has been created to handle all the incoming request from credit card application.
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CardController {

	private final CardRepository repository;

	private static final ObjectMapper objectMapper = new ObjectMapper();

	CardController(CardRepository repository) {
		this.repository = repository;
	}


	@GetMapping("")
	CollectionModel<EntityModel<Card>> all() {

		List<EntityModel<Card>> cards = repository.findAll().stream()
				.map(card -> EntityModel.of(card,
						linkTo(methodOn(CardController.class).one(card.getId())).withSelfRel(),
						linkTo(methodOn(CardController.class).all()).withRel("cards")))
				.collect(Collectors.toList());

		return CollectionModel.of(cards, linkTo(methodOn(CardController.class).all()).withSelfRel());
	}


	@PostMapping(value="/creditCard/add",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createCreditCard(@RequestBody Card card) {
			try {
				repository.save(card);
				return new ResponseEntity<Object>(HttpStatus.OK);
			} catch (DuplicateKeyException e) {
				return new ResponseEntity<Error>(HttpStatus.CONFLICT);
			}
	}

	@GetMapping(value="/creditCard/getAll")
	public List<Card> getAllCreditCards() {

		return repository.findAll();
	}

	@GetMapping("/card/{id}")
	EntityModel<Card> one(@PathVariable Long id) {

		Card card = repository.findById(id)
				.orElseThrow(() -> new CardNotFoundException(id));
		return EntityModel.of(card,
				linkTo(methodOn(CardController.class).one(id)).withSelfRel(),
				linkTo(methodOn(CardController.class).all()).withRel("cards"));
	}

}