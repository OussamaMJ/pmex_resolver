package com.degetel.pmex.en.dao;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityCompanyPublications;
import com.degetel.pmex.en.repositories.CompanyPublicationsRepository;

@Repository
public interface CompanyPublicationsDao extends CompanyPublicationsRepository {

	EntityCompanyPublications findByUuid(String id);
}
