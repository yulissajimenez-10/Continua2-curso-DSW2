package com.data.Continua2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.data.Continua2.modelo.Respuesta;
import com.data.Continua2.repo.RepoCliente;


@Service
@Transactional
public class ClienteService  {
	
	@Autowired
	private RepoCliente repo;
	
	

	public List<Respuesta> listarClienteFactura() {		
		  List<Respuesta> lista = new ArrayList<Respuesta>(); 
		  
		  List<Object[]> lstobj = repo.listarClienteFactura();
		  for(Object[] obj : lstobj) {
	    	 Respuesta r = new Respuesta();	    	 
	    	 
	    	 r.setCodCliente(Integer.valueOf(obj[0].toString()));
	    	 r.setCan_fac(Integer.valueOf(obj[1].toString()));
	    	 r.setMonto_total(Double.valueOf(obj[2].toString()));    	 
	    	 
	    	 
	    	  lista.add(r);
	      }  
		  return lista;
	}
	
	
	
	
}
	
	
	
	
	
	
	


