package com.degetel.pmex.en.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityCompanies;

@NoRepositoryBean
public interface CompaniesRepository extends JpaRepository<EntityCompanies, Long> {

	EntityCompanies findByPsin(String psin);
}