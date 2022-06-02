package com.iudigital.autoscol.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.autoscol.domain.Registro;

@Repository
public interface RegistroRepository extends CrudRepository<Registro, Integer> {

}
