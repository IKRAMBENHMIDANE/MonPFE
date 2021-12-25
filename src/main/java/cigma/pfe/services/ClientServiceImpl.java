package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService {
	public ClientServiceImpl() {
		System.out.println("CallClientServiceImpl ....");
	}

	// ClientRepository clientRepository = new ClientRepositoryImpl();
	ClientRepository clientRepository;

	/*
	 * @Override public Client save(Client c) {
	 * System.out.println("Service Layer : ClientServiceImpl Level... "); return
	 * clientRepository.save(c); }
	 */

	@Override
	public Client save(Client c) {
		return null;
	}

	/*
	 * public void setClientRepository(ClientRepository clientRepository) {
	 * this.clientRepository = clientRepository; }
	 */
	public ClientServiceImpl(ClientRepository clientRepository) {
		System.out.println("Call ClientService with clientRepositoryparam....");
		this.clientRepository = clientRepository;
	}

}