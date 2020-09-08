package com.degetel.pmex.en.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityTransactions;
import com.degetel.pmex.en.repositories.TransactionsRepository;

@Repository
public interface TransactionsDao extends TransactionsRepository {

	 default List<EntityTransactions> getAllByTraderId(Long idUser) {
	    	return getAllByIdBuyerOrIdSellerOrderByCreatedAtDesc(idUser, idUser);
		}
	List<EntityTransactions> getAllByIdBuyerOrIdSellerOrderByCreatedAtDesc(Long idBuyer, Long idSeller);
}
