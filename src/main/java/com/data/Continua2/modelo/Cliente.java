package com.data.Continua2.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.data.Continua2.modelo.Factura;

@Entity
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente ;
	@Column
	 private String nombre ;
	 
	 
	 @OneToMany(mappedBy = "cliente")
	 private Set<Factura> itemsFacturas = new HashSet<>();
	 
	 
	 
	 
	 public Cliente() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	public Cliente(int idCliente, String nombre) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Set<Factura> getItemsFacturas() {
		return itemsFacturas;
	}



	public void setItemsFacturas(Set<Factura> itemsFacturas) {
		this.itemsFacturas = itemsFacturas;
	}
	 
	 
	 
	 
}
