package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityCompanyPublications;
import com.degetel.pmex.en.enums.RefTypePublication;

@NoRepositoryBean
public interface CompanyPublicationsRepository extends JpaRepository<EntityCompanyPublications, Long> {

	EntityCompanyPublications findByUuid(String uuid);
	  List<EntityCompanyPublications> findAllByIdCompany(Long idCompany);
	  List<EntityCompanyPublications> findAllByIdCompanyAndCategory(Long idCompany, RefTypePublication category);
	  List<EntityCompanyPublications> findAllByIdAuthor(Long idAuthor);
}
