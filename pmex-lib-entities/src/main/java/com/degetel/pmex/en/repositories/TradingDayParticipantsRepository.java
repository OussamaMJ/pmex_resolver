package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityTradingDayParticipants;

@NoRepositoryBean
public interface TradingDayParticipantsRepository extends JpaRepository<EntityTradingDayParticipants, Long> {

	  EntityTradingDayParticipants findByIdTradingDayAndIdParticipant(long idTradingDay, long idParticipant);
	  List<EntityTradingDayParticipants> findAllByIdTradingDay(long idTradingDay);
	  List<EntityTradingDayParticipants> findAllByIdParticipant(long idParticipant);
}
