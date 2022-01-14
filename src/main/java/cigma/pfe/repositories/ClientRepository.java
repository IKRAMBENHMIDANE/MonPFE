package cigma.pfe.repositories;

import java.util.List;

import cigma.pfe.models.Client;

public interface ClientRepository {
	Client save(Client c);
	Client update(Client c);
	void deleteById(long id);
	Client findById(long id);
	 List<Client> findAll();
}
