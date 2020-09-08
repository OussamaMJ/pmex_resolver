package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityCompanyShares;

@NoRepositoryBean
public interface CompanySharesRepository extends JpaRepository<EntityCompanyShares, Long> {

	  List<EntityCompanyShares> findAllByIdOwner(Long idOwner);
	  List<EntityCompanyShares> findAllByIdCompany(Long idCompany);
}
