package cigma.pfe.services;

import cigma.pfe.models.Client;

public interface ClientService {
	Client save(Client c);
	Client update(Client c);
	void deleteById(long id);
	Client findById(long id);
}
