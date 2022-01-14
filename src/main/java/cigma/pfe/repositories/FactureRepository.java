package cigma.pfe.repositories;

import cigma.pfe.models.Facture;

public interface FactureRepository {
	Facture create(Facture f);
	Facture read(Facture f);
	Facture update(Facture f);
	void delete(Facture f);
	

}
