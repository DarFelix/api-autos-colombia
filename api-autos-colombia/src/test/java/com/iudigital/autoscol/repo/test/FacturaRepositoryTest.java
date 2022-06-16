package com.iudigital.autoscol.repo.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.iudigital.autoscol.data.FacturaRepository;
import com.iudigital.autoscol.domain.Factura;
import com.iudigital.autoscol.service.FacturaService;

@SpringBootTest
public class FacturaRepositoryTest {

	@InjectMocks
	FacturaService facturaService;

	@Mock
	FacturaRepository facturaRepository;

	@Mock
	FacturaService facturaServiceMock;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void listarFacturas() {

		Factura factura = new Factura();
		factura.setIdFactura(1);
		factura.setValorHora(3100D);
		factura.setHorasParqueo(12D);
		factura.setMedioPago("Tarjeta");
		factura.setRegistro(null);

		List<Factura> facturas = new ArrayList<>();

		facturas.add(factura);

		when(facturaRepository.findAll()).thenReturn(facturas);

		List<Factura> facturasObtenidas = facturaService.getFacturas();

		assertEquals(facturasObtenidas.size(), facturas.size());

	}
}
