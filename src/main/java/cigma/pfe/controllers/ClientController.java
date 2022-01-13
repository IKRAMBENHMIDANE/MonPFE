package cigma.pfe.controllers;

import cigma.pfe.services.ClientService;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;



public class ClientController {
	// ClientService clientService = new ClientServiceImpl();
	ClientService clientService;
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
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
	public Client findById(long id){
		return clientService.findById(id);
		}

}