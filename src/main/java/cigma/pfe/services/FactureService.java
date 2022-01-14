package cigma.pfe.services;

import cigma.pfe.models.Facture;

public interface FactureService {
	Facture create(Facture f);
	Facture read(Facture f);
	Facture update(Facture f);
	void delete(Facture f);

}
