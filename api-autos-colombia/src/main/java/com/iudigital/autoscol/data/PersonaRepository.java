package com.iudigital.autoscol.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.autoscol.domain.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
