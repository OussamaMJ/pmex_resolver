package com.degetel.pmex.en.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityCompanyShares;
import com.degetel.pmex.en.repositories.CompanySharesRepository;

@Repository
public interface CompanySharesDao extends CompanySharesRepository {

	List<EntityCompanyShares> findAllByIdOwnerAndIdCompany(Long idOwner, Long idCompany);
	Long countByIdOwnerAndIdCompany(Long idOwner, Long idCompany);
	List<EntityCompanyShares> findAllByIdOwnerAndIdCompanyAndAvailabilityDateBefore(Long idOwner, Long idCompany,
			Date availabilityDate);
}
