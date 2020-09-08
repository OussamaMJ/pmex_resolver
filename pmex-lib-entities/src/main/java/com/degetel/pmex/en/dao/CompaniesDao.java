package com.degetel.pmex.en.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityCompanies;
import com.degetel.pmex.en.repositories.CompaniesRepository;

@Repository
public interface CompaniesDao extends CompaniesRepository{

	/**
	 * This method used to find companies by name.
	 *
	 * @param name the name
	 * @return the entity companies
	 */
	public List<EntityCompanies> findByNameContaining(String name);
}
