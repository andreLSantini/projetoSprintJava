package com.dio.santini.projetoSprintJava.model.repository;

import com.dio.santini.projetoSprintJava.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
