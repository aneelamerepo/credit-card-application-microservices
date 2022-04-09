package com.creditcard.dao.jpa;

import com.creditcard.domain.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This Interface has been created for JpaRepository
 */
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
