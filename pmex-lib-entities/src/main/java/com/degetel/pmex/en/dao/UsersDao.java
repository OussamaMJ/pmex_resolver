package com.degetel.pmex.en.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.degetel.pmex.en.entities.EntityUsers;
import com.degetel.pmex.en.repositories.UsersRepository;

@Repository
public interface UsersDao extends UsersRepository {

	List<EntityUsers> findAllByUuidIn(List<String> usersIds);

	List<EntityUsers> findAllByIdIn(List<Long> usersIds);

	EntityUsers findByIdEmployerAndIsCeoTrue(Long idEmployer);
}
