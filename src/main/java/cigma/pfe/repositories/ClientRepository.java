package cigma.pfe.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import cigma.pfe.models.Client;
 
@Repository
public interface ClientRepository extends CrudRepository<Client,Long>{
	List<Client> findByName(String name);

	
}
