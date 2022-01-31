package cigma.pfe.controllers;

import cigma.pfe.services.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cigma.pfe.models.Client;

@Controller("controller1")
public class ClientController {

	@Autowired
	ClientService clientService;
	
	public Client save(Client clt) {
		return clientService.save(clt);
		}
		public Client modify(Client clt) {
		return clientService.modify(clt);
		}
		public void remove(long idClt) {
			clientService.remove(idClt);
		}
		public Client getOne(long idClt) {
		return clientService.getOne(idClt);
		}
		public List<Client> getAll() {
		return clientService.getAll();
		}
		public List<Client> findByName(String name) {
			return clientService.findByName(name);
			}
}