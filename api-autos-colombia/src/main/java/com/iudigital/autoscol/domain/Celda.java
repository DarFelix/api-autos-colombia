package com.iudigital.autoscol.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "celdas")
public class Celda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_celda")
	private Integer idCelda;
	
	private String estado;
	
	@Column(name = "tipo_vehiculo")
	private String tipoVehiculo;

	public Integer getIdCelda() {
		return idCelda;
	}

	public void setIdCelda(Integer idCelda) {
		this.idCelda = idCelda;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

}
