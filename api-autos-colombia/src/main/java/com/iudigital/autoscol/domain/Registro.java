package com.iudigital.autoscol.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registros")
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_registro")
	private Integer idRegistro;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_empleado")
	private Persona empleado;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_celda")
	private Celda celda;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_vehiculo")
	private Vehiculo vehiculo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Persona cliente;
	
	@Column(name = "fecha_entrada")
	private LocalDateTime fechaEntrada;
	
	@Column(name = "novedad_entrada")
	private String novedadEntrada;
	
	@Column(name = "fecha_salida")
	private LocalDateTime fechaSalida;
	
	@Column(name = "novedad_salida")
	private String novedadSalida;
	
	@Column(name = "valor_pago")
	private Double valorPago;

	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Persona getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Persona empleado) {
		this.empleado = empleado;
	}

	public Celda getCelda() {
		return celda;
	}

	public void setCelda(Celda celda) {
		this.celda = celda;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getNovedadEntrada() {
		return novedadEntrada;
	}

	public void setNovedadEntrada(String novedadEntrada) {
		this.novedadEntrada = novedadEntrada;
	}

	public LocalDateTime getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDateTime fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getNovedadSalida() {
		return novedadSalida;
	}

	public void setNovedadSalida(String novedadSalida) {
		this.novedadSalida = novedadSalida;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

}
