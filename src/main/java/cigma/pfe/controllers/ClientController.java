package cigma.pfe.controllers;

import cigma.pfe.services.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cigma.pfe.models.Client;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	ClientService clientService;

	@PostMapping("/create")
	public Client save(@RequestBody  Client clt) {
		return clientService.save(clt);
	}

	@PutMapping("/update")
	public Client modify(@RequestBody  Client clt) {
		return clientService.modify(clt);
	}

	public void remove(long idClt) {
		clientService.remove(idClt);
	}

	@GetMapping("/{id}")
	public Client getOne(@PathVariable("id") long idClt) {
		return clientService.getOne(idClt);
	}

	@GetMapping("/all")
	public List<Client> getAll() {
		return clientService.getAll();
	}

	public List<Client> findByName(String name) {
		return clientService.findByName(name);
	}
}