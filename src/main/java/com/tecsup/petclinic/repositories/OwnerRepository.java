package com.tecsup.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Owner;

//CrudRepository
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
