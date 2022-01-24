package cigma.pfe.controllers;

import cigma.pfe.services.ClientService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.services.ClientServiceImpl;

@Controller("controller1")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	

	

	public ClientController(ClientService clientService) {
		System.out.println("Call ClientController with clientServiceparam....");
		this.clientService = clientService;
	}

	public ClientController() {
		System.out.println("CallClientController ....");
	}

	public void save(Client c) {
		System.out.println("ClientController level...");
		clientService.save(c);
	}

	public void update(Client c) {
		System.out.println("ClientController level...");
		clientService.update(c);
	}

	public void deleteById(long id) {
		System.out.println("ClientController level...");
		clientService.deleteById(id);
	}

	public Client findById(long id) {
		return clientService.findById(id);
	}

	private List<Client> clientsService = new ArrayList<>();

	public List<Client> findAll() {
		return ((ClientService) clientsService).findAll();
	}
}