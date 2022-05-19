package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
@RestController
public class ClienteController {

	@GetMapping("/clientes")	
	public List<Cliente> listar()  {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Joao");
		cliente1.setTelefone("5571987034904");
		cliente1.setEmail("joao@terra.com.br");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("55713234904");
		cliente2.setEmail("maria@terra.com.br");
		
			return Arrays.asList(cliente1, cliente2);
				// TODO Auto-generated method stub
	}

}
