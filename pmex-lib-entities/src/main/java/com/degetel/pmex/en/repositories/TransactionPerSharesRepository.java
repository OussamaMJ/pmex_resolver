package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityTransactionPerShares;

@NoRepositoryBean
public interface TransactionPerSharesRepository extends JpaRepository<EntityTransactionPerShares, Long> {

	  List<EntityTransactionPerShares> findAllByIdShare(Long idShare);
	  List<EntityTransactionPerShares> findAllByIdTransaction(Long idTransaction);
	  EntityTransactionPerShares findByUuid(String uuid);
}
