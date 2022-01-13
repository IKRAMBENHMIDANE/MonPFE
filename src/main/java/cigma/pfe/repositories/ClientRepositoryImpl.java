package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

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
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
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

	

}