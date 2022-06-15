package com.iudigital.autoscol.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.autoscol.domain.Factura;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Integer> {

}
