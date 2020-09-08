package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityUserNationality;

@NoRepositoryBean
public interface UserNationalityRepository extends JpaRepository<EntityUserNationality, Long>{

	  List<EntityUserNationality> findAllByIdCustomer(long idCustomer);
	  EntityUserNationality findByIdCustomerAndCountry(long idCustomer, String country);
}
