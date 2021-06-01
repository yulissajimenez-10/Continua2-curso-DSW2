package com.data.Continua2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.Continua2.modelo.Respuesta;
import com.data.Continua2.service.ClienteService;

@RestController
@RequestMapping("/factura")
public class ClienteRestController {

	@Autowired
	private ClienteService service;
	
	
	
	@GetMapping(value = "/resumen")
	public ResponseEntity<List<Respuesta>> listarClienteFactura(){
		List<Respuesta> lista = service.listarClienteFactura();
		return new ResponseEntity<List<Respuesta>>(lista, HttpStatus.OK);
		
	}
	
	  
	  
	
	
	
}
