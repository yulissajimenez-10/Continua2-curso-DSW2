package com.data.Continua2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.data.Continua2.modelo.Cliente;

public interface RepoCliente extends JpaRepository<Cliente, Integer> {	
	
	
	@Query(value="select id_cliente, count(*)can_Factura,SUM(d.monto_factura)Monto_total from "
			+ "cliente c,factura d where c.id_cliente = d.cliente_id group by id_cliente ",nativeQuery = true )
	public List<Object[]> listarClienteFactura();
	
	
	
	
	
	

}

