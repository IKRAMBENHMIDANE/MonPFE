package cigma.pfe.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;



@Service
@Transactional
public class ClientServiceImpl implements ClientService {
	
		@Autowired
	private ClientRepository clientRepository;
		
	@Override
	@Transactional
	public Client save(Client clt) {
	return clientRepository.save(clt);
	}

	@Override
	@Transactional
	public Client modify(Client newClt) {
	Client oldClt = clientRepository.findById(newClt.getId()).get();
	oldClt.setName(newClt.getName());
	return clientRepository.save(oldClt);
	}
	
	@Override
	@Transactional
	public void remove(long idClt) {
		clientRepository.deleteById(idClt);
	}
	
	@Override
	public Client getOne(long idClt) {
	return clientRepository.findById(idClt).get();
	}
	
	@Override
	public List<Client> getAll() {
	return (List<Client>) clientRepository.findAll();
	}

	@Override
	public List<Client> findByName(String name) {
		return   clientRepository.findByName(name);

	}
}