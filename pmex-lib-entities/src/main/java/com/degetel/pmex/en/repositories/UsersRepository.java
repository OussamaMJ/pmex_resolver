package com.degetel.pmex.en.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.degetel.pmex.en.entities.EntityUsers;

@NoRepositoryBean
public interface UsersRepository extends JpaRepository<EntityUsers, Long>{

	  EntityUsers findByUuid(String uuid);
	  List<EntityUsers> findAllByIdAddressBilling(Long idAddressBilling);
	  List<EntityUsers> findAllByIdEmployer(Long idEmployer);
	  EntityUsers findByEmail(String email);
	  List<EntityUsers> findAllByIdAddressContact(Long idAddressContact);
}
