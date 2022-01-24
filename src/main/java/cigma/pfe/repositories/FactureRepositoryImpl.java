package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class FactureRepositoryImpl implements FactureRepository {

	private FactureRepository factureRepository;

	public void setFactureRepository(FactureRepository factureRepository) {
		this.factureRepository = factureRepository;
	}
	
	public FactureRepositoryImpl() {
		
	}

	@PersistenceContext
	EntityManager emm;

	@Override
	public Facture create(Facture f) {
		emm.persist(f);
		return null;
	}

	@Override
	public Facture read(Facture f) {
		return emm.find(Facture.class,f.getId());
	}

	@Override
	public Facture update(Facture f) {
		Facture currentFacture =emm.find(Facture.class,f.getId());
		currentFacture.setDescription(f.getDescription());
		emm.persist(currentFacture);
		return null;
	}

	@Override
	public void delete(Facture f) {
		Facture factureInDataBase = emm.find(Facture.class,f.getId());
		emm.remove(factureInDataBase);
		

	}

}
