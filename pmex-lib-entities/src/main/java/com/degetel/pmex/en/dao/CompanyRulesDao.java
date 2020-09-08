package com.degetel.pmex.en.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityCompanyRules;
import com.degetel.pmex.en.repositories.CompanyRulesRepository;

@Repository
public interface CompanyRulesDao extends CompanyRulesRepository {

	  // write your own method here
		List<EntityCompanyRules> findAllByIdCompany(Long idCompany);
}
