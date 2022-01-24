package cigma.pfe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.FactureRepository;


@Service
@Transactional
public class FactureServiceImpl implements FactureService {
	
	public FactureServiceImpl() {
		System.out.println("CallFactureServiceImpl ....");
	}
	
	public FactureServiceImpl(FactureRepository factureRepository) {
		System.out.println("Call FactureService with factureRepositoryparam....");
		this.factureRepository = factureRepository;
	}
	@Autowired
	private FactureRepository factureRepository;
	

	@Override
	public Facture create(Facture f) {
		return factureRepository.create(f);
	}

	@Override
	public Facture read(Facture f) {
		return factureRepository.read(f);
	}

	@Override
	public Facture update(Facture f) {
		return factureRepository.update(f);
	}

	@Override
	public void delete(Facture f) {
		 factureRepository.delete(f);
		
	}

}
