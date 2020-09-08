package com.degetel.pmex.en.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityCompanyShareholders;
import com.degetel.pmex.en.repositories.CompanyShareholdersRepository;
@Repository
public interface CompanyShareholdersDao extends CompanyShareholdersRepository {

	// write your own method here
		Long countByIdCompanyAndIdUser(Long idCompany, Long idUser);

		@Query(value = "SELECT c.* FROM company_shareholders c JOIN users u ON c.id_user = u.id "
				+ "WHERE c.id_company = :idCompany AND (u.name_first LIKE CONCAT( '%', :searchName, '%') OR u.name_family LIKE CONCAT( '%', :searchName, '%'))", nativeQuery = true)
		List<EntityCompanyShareholders> findAllBySearchName(@Param("searchName") String searchName,
				@Param("idCompany") Long idCompany);

}
