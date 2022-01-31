package cigma.pfe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;


@Service
@Transactional
public class FactureServiceImpl implements FactureService {

	@Autowired
	private FactureRepository factureRepository;

	@Override
	@Transactional
	public Facture save(Facture fac) {
		return factureRepository.save(fac);
	}

	@Override
	@Transactional
	public Facture modify(Facture newFac) {
		Facture oldFac = factureRepository.findById(newFac.getId()).get();
		oldFac.setDescription(newFac.getDescription());
		return factureRepository.save(oldFac);
	}

	@Override
	@Transactional
	public void remove(long idFac) {
		factureRepository.deleteById(idFac);
		
	}

	@Override
	public Facture getOne(long idFac) {
		return factureRepository.findById(idFac).get();
	}

	@Override
	public List<Facture> getAll() {
		return (List<Facture>) factureRepository.findAll();
	}

	@Override
	public List<Facture> findByDescription(String description) {
		return factureRepository.findByDescription(description);
	}
	


}
