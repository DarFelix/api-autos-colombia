package com.iudigital.autoscol.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.autoscol.domain.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {

}
