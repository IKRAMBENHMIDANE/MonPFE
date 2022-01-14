package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class ClientRepositoryImpl implements ClientRepository {
	
	private ClientRepository clientRepository;
	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
		}

	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em = emf.createEntityManager();

	public ClientRepositoryImpl() {
		System.out.println("CallClientRepositoryImpl ....");
	}

	@Override
	public Client save(Client c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return null;
	}

	@Override
	public Client update(Client c) {
		em.getTransaction().begin();
		Client currentClient =em.find(Client.class,c.getId());
		currentClient.setName(c.getName());
		em.persist(currentClient);
		em.getTransaction().commit();
		return null;
		}

	@Override
	public void deleteById(long id) {
		em.getTransaction().begin();
		Client clientInDataBase = em.find(Client.class,id);
		em.remove(clientInDataBase);
		em.getTransaction().commit();
		
	}
	
	@Override
	public Client findById(long id) {
	return em.find(Client.class,id);
	}
	
	private List<Client> clientsRepository = new ArrayList<>();
	
	@Override
	public List<Client> findAll() {
		Query query = em.createQuery("SELECT u FROM unit_clients u",Client.class);
	    return (List<Client>) query.getResultList();
		
	}

	

}