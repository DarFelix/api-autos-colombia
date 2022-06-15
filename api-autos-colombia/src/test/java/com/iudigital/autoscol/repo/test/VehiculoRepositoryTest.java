package com.iudigital.autoscol.repo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.iudigital.autoscol.data.VehiculoRepository;
import com.iudigital.autoscol.domain.Vehiculo;

@SpringBootTest
public class VehiculoRepositoryTest {

	@Autowired
    private VehiculoRepository vehiculoRepository;
	
	@Test
    void isVehiExitsById() {
        Vehiculo vehi = new Vehiculo();
        
        vehi.setIdVehiculo(1);
        vehi.setMarca("Mazda");
        vehi.setColor("Verde");
        vehi.setModelo("2022");
        vehi.setPlaca("TYH-323");
        vehi.setObservaciones("Ninguna");
        vehi.setTipoVehiculo("Carro");
        
        
        vehiculoRepository.save(vehi);
        Boolean actualResult = vehiculoRepository.existsById(1);
        assertThat(actualResult).isTrue();
    }
	
	
}
