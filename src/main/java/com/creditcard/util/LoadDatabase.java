package com.creditcard.util;

import com.creditcard.dao.jpa.CreditCardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This is to initialize  some entries into card table.
 */

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(CreditCardRepository repository) {

		return args -> {
			//log.info("Preloading " + repository.save(new Card("Alice", "1111 2222 3333 4444","3000","0")));
			//log.info("Preloading " + repository.save(new Card("Bob", "4444 3333 2222 1111","2000","0")));
		};
	}
}
