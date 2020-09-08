package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityTransactions;

@NoRepositoryBean
public interface TransactionsRepository extends JpaRepository<EntityTransactions, Long> {

	  EntityTransactions findByUuid(String uuid);
	  List<EntityTransactions> findAllByIdSeller(long idSeller);
	  List<EntityTransactions> findAllByIdSellerOrder(long idSellerOrder);
	  List<EntityTransactions> findAllByIdTradingDay(long idTradingDay);
	  List<EntityTransactions> findAllByIdBuyerOrder(long idBuyerOrder);
	  List<EntityTransactions> findAllByIdBuyer(long idBuyer);
}
