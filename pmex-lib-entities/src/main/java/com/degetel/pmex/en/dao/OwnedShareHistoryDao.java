package com.degetel.pmex.en.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityOwnedShareHistory;
import com.degetel.pmex.en.repositories.OwnedShareHistoryRepository;

@Repository
public interface OwnedShareHistoryDao extends OwnedShareHistoryRepository {

	List<EntityOwnedShareHistory> findAllByIdUserAndIdCompany(Long idUser, Long idCompany);
	List<EntityOwnedShareHistory> findAllByIdUser(long idUser);
}
