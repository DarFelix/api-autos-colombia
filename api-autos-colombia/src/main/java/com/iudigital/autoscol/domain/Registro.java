package com.iudigital.autoscol.domain;

import java.time.LocalDateTime;

public class Registro {

	private Integer idRegistro;
	private Empleado empleado;
	private Celda celda;
	private Vehiculo vehiculo;
	private Persona cliente;
	private LocalDateTime fechaEntrada;
	private String novedadEntrada;
	private LocalDateTime fechaSalida;
	private String novedadSalida;
	private Double valorPago;

	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
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
