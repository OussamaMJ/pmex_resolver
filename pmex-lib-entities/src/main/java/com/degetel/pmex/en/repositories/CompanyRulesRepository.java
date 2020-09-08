package com.degetel.pmex.en.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityCompanyRules;

@NoRepositoryBean
public interface CompanyRulesRepository extends JpaRepository<EntityCompanyRules, Long>{

}
