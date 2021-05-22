package com.apirest.apirest.controller; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.apirest.apirest.model.Cliente;
import com.apirest.apirest.repository.ClienteRepository; 




@RestController 
@RequestMapping
public class ClienteController { 
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")  
	public List<Cliente> retrieveAllClientes() {
		return clienteRepository.findAll();
	} 
	
	@GetMapping("/clientes/{id}")
	public Cliente retrieveCliente(@PathVariable long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);

		return cliente.get();
	}
	
	@PostMapping("/clientes") 
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
    
	@DeleteMapping("/clientes/{id}")
	public void deleteStudent(@PathVariable long id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/clientes/{id}")
	public ResponseEntity<Object> updateCliente(@RequestBody Cliente cliente, @PathVariable long id) {

		Optional<Cliente> clienteOptional = clienteRepository.findById(id);

		if (!clienteOptional.isPresent())
			return ResponseEntity.notFound().build();

		cliente.setId(id);
		
		clienteRepository.save(cliente);

		return ResponseEntity.noContent().build();
	}
	
}