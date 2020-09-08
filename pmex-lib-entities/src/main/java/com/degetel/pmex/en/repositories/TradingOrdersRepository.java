package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityTradingOrders;
import com.degetel.pmex.en.enums.RefTypeOrder;

@NoRepositoryBean
public interface TradingOrdersRepository extends JpaRepository<EntityTradingOrders, Long> {

	  EntityTradingOrders findByUuid(String uuid);
	  List<EntityTradingOrders> findAllByIdTrading(Long idTrading);
	  List<EntityTradingOrders> findAllByIdUser(Long idUser);
	  List<EntityTradingOrders> findAllByTypeOrder(RefTypeOrder typeOrder);
}
