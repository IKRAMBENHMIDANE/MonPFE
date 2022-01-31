package cigma.pfe.services;

import java.util.List;
import cigma.pfe.models.Facture;

public interface FactureService {	
	Facture save(Facture fac);
	Facture modify(Facture fac);
	void remove(long idFac);
	Facture getOne(long idFac);
	List<Facture> getAll();
	List<Facture> findByDescription(String description);



}
