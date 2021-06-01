package com.data.Continua2.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.data.Continua2.modelo.Cliente;

@Entity
public class Factura implements Serializable{
	private static final long serialVersionUID = 1L;
		
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFactura;
	@Column
	private double montoFactura;
	
	@ManyToOne
	@JoinColumn(name="cliente_id", nullable = false , foreignKey = 
    @ForeignKey(foreignKeyDefinition = "foreign key (cliente_id)references cliente (cliente_id)"))
	private Cliente cliente;

	public Factura(int idFactura, double montoFactura) {
		super();
		this.idFactura = idFactura;
		this.montoFactura = montoFactura;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public double getMontoFactura() {
		return montoFactura;
	}

	public void setMontoFactura(double montoFactura) {
		this.montoFactura = montoFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
