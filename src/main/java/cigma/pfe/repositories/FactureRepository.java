package cigma.pfe.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cigma.pfe.models.Facture;


@Repository
public interface FactureRepository extends CrudRepository<Facture,Long>{
	List<Facture> findByDescription(String description);


	

}
