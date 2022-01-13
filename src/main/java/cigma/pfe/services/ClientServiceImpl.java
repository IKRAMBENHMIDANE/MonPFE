package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService {
	public ClientServiceImpl() {
		System.out.println("CallClientServiceImpl ....");
	}

	// ClientRepository clientRepository = new ClientRepositoryImpl();
	private ClientRepository clientRepository;
	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
		}


	/*
	 * @Override public Client save(Client c) {
	 * System.out.println("Service Layer : ClientServiceImpl Level... "); return
	 * clientRepository.save(c); }
	 */

	/*
	 * public void setClientRepository(ClientRepository clientRepository) {
	 * this.clientRepository = clientRepository; }
	 */
	public ClientServiceImpl(ClientRepository clientRepository) {
		System.out.println("Call ClientService with clientRepositoryparam....");
		this.clientRepository = clientRepository;
	}

	@Override
	public Client save(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public Client update(Client c) {
		return clientRepository.update(c);
	}


	@Override
	public void deleteById(long id) {
		clientRepository.deleteById(id);

		
	}

	@Override
	public Client findById(long id) {
	return clientRepository.findById(id);
	}
}