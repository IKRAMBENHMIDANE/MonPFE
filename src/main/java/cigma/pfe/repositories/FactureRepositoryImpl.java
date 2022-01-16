package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class FactureRepositoryImpl implements FactureRepository {

	private FactureRepository factureRepository;

	public void setFactureRepository(FactureRepository factureRepository) {
		this.factureRepository = factureRepository;
	}
	
	public FactureRepositoryImpl() {
		
	}

	EntityManagerFactory emff = Persistence.createEntityManagerFactory("unit_factures");
	EntityManager emm = emff.createEntityManager();

	@Override
	public Facture create(Facture f) {
		emm.getTransaction().begin();
		emm.persist(f);
		emm.getTransaction().commit();
		return null;
	}

	@Override
	public Facture read(Facture f) {
		return emm.find(Facture.class,f.getId());
	}

	@Override
	public Facture update(Facture f) {
		emm.getTransaction().begin();
		Facture currentFacture =emm.find(Facture.class,f.getId());
		currentFacture.setDescription(f.getDescription());
		emm.persist(currentFacture);
		emm.getTransaction().commit();
		return null;
	}

	@Override
	public void delete(Facture f) {
		emm.getTransaction().begin();
		Facture factureInDataBase = emm.find(Facture.class,f.getId());
		emm.remove(factureInDataBase);
		emm.getTransaction().commit();
		

	}

}
