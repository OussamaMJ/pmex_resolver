package com.degetel.pmex.en.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityTradingDays;
import com.degetel.pmex.en.repositories.TradingDaysRepository;

@Repository
public interface TradingDaysDao extends TradingDaysRepository {

	List<EntityTradingDays> findAllByIdCompanyAndTimestampStartBeforeAndTimestampEndAfter(long idCompany, Date timestampStart,
			Date timestampEnd);

	List<EntityTradingDays> findAllByIdCompanyOrderByTimestampEndDesc(long idCompany);

	List<EntityTradingDays> findAllByTimestampStartBeforeAndTimestampEndAfter(Date timestampStart, Date timestampEnd);

	EntityTradingDays getFirstByIdCompanyOrderByTimestampEndDesc(Long idCompany);
}
