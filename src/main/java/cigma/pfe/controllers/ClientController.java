package cigma.pfe.controllers;

import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {
	// ClientService clientService = new ClientServiceImpl();
	ClientService clientService;

	public Client save(Client c) {
		System.out.println("ClientController level...");
		return clientService.save(c);
	}

	/*
	 * public void setClientService(ClientService clientService) {
	 * this.clientService = clientService; }
	 */

	public ClientController(ClientService clientService) {
		System.out.println("Call ClientController with clientServiceparam....");
		this.clientService = clientService;
	}

	public ClientController() {
		System.out.println("CallClientController ....");
	}

}