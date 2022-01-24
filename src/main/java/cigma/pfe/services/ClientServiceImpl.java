package cigma.pfe.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;


@Service
@Transactional
public class ClientServiceImpl implements ClientService {
	public ClientServiceImpl() {
		System.out.println("CallClientServiceImpl ....");
	}
	@Autowired
	private ClientRepository clientRepository;
	

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

	private List<Client> clientsRepository = new ArrayList<>();
	
	@Override
	public List<Client> findAll() {
		return  ((ClientRepository) clientsRepository).findAll();
	}
}