package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityTradingDays;

@NoRepositoryBean
public interface TradingDaysRepository extends JpaRepository<EntityTradingDays, Long> {

	  List<EntityTradingDays> findAllByRulesSeller(Long rulesSeller);
	  EntityTradingDays findByUuid(String uuid);
	  List<EntityTradingDays> findAllByIdCompany(Long idCompany);
	  List<EntityTradingDays> findAllByRulesBuyer(Long rulesBuyer);
}
