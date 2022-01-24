package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

	private ClientRepository clientRepository;

	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@PersistenceContext
	EntityManager em;

	public ClientRepositoryImpl() {
		System.out.println("CallClientRepositoryImpl ....");
	}

	@Override
	public Client save(Client c) {
		em.persist(c);
		return null;
	}

	@Override
	public Client update(Client c) {
		Client currentClient = em.find(Client.class, c.getId());
		currentClient.setName(c.getName());
		em.persist(currentClient);
		return null;
	}

	@Override
	public void deleteById(long id) {
		Client clientInDataBase = em.find(Client.class, id);
		em.remove(clientInDataBase);

	}

	@Override
	public Client findById(long id) {
		return em.find(Client.class, id);
	}

	private List<Client> clientsRepository = new ArrayList<>();

	@Override
	public List<Client> findAll() {
		Query query = em.createQuery("SELECT u FROM unit_clients u", Client.class);
		return (List<Client>) query.getResultList();

	}

}