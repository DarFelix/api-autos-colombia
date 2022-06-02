package com.iudigital.autoscol.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.autoscol.domain.Vehiculo;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo, Integer> {

}
