package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityOwnedShareHistory;

@NoRepositoryBean
public interface OwnedShareHistoryRepository extends JpaRepository<EntityOwnedShareHistory, Long> {

	  List<EntityOwnedShareHistory> findAllByIdCompanyAndTimestampLog(Long idCompany, java.util.Date timestampLog);
	  List<EntityOwnedShareHistory> findAllByIdCompany(Long idCompany);
	  List<EntityOwnedShareHistory> findAllByIdUser(Long idUser);
}
