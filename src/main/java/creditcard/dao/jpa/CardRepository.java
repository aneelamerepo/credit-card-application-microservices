package creditcard.dao.jpa;

import creditcard.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This Interface has been created for JpaRepository
 */
public interface CardRepository extends JpaRepository<Card, Long> {

}
