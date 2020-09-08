package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityUsersAlerts;

@NoRepositoryBean
public interface UsersAlertsRepository extends JpaRepository<EntityUsersAlerts, Long>{

	  EntityUsersAlerts findByUuid(String uuid);
	  List<EntityUsersAlerts> findAllByIdUserReceipient(Long idUserReceipient);
	  List<EntityUsersAlerts> findAllByIdUserSource(Long idUserSource);
	  List<EntityUsersAlerts> findAllByIdTradingSource(Long idTradingSource);
}
