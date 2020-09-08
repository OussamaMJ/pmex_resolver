package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityCompanyShareholders;

@NoRepositoryBean
public interface CompanyShareholdersRepository extends JpaRepository<EntityCompanyShareholders, Long>{

	  EntityCompanyShareholders findByIdUserAndIdCompany(long idUser, long idCompany);
	  List<EntityCompanyShareholders> findAllByIdCompany(long idCompany);
	  List<EntityCompanyShareholders> findAllByIdUser(long idUser);
}
