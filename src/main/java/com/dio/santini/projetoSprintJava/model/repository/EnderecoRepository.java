package com.dio.santini.projetoSprintJava.model.repository;

import com.dio.santini.projetoSprintJava.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
