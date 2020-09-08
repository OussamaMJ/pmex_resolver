package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityUserSetupAlerts;

@NoRepositoryBean
public interface UserSetupAlertsRepository extends JpaRepository<EntityUserSetupAlerts, Long>{

	  List<EntityUserSetupAlerts> findAllByIdUser(Long idUser);
	  List<EntityUserSetupAlerts> findAllByIdTradingDay(Long idTradingDay);
}
