package cigma.pfe.services;


import java.util.List;
import cigma.pfe.models.Client;

public interface ClientService {
	Client save(Client clt);
	Client modify(Client clt);
	void remove(long idClt);
	Client getOne(long idClt);
	List<Client> getAll();
	List<Client> findByName(String name);


}
