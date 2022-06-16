package com.iudigital.autoscol.domain;

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
@Table(name = "facturas")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura")
	private Integer idFactura;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_registro")
	private Registro registro;

	@Column(name = "valor_hora")
	private Double valorHora;

	@Column(name = "horas_parqueo")
	private Double horasParqueo;

	@Column(name = "medio_pago")
	private String medioPago;

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double getHorasParqueo() {
		return horasParqueo;
	}

	public void setHorasParqueo(Double horasParqueo) {
		this.horasParqueo = horasParqueo;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

}
