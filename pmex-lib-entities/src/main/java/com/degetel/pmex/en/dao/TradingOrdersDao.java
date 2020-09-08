package com.degetel.pmex.en.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityTradingOrders;
import com.degetel.pmex.en.enums.RefTypeOrder;
import com.degetel.pmex.en.repositories.TradingOrdersRepository;

@Repository
public interface TradingOrdersDao extends TradingOrdersRepository {

	List<EntityTradingOrders> findAllByIdTradingAndIdUserAndTypeOrder(Long idTrading, Long idUser, RefTypeOrder typeOrder);

}
