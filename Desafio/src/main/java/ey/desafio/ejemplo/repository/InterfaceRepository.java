package ey.desafio.ejemplo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ey.desafio.ejemplo.model.EntityModel;


@Repository
public interface InterfaceRepository extends CrudRepository<EntityModel, String>{



}
