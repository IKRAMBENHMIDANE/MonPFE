package cigma.pfe.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;

@Controller("controller2")
public class FactureController {
	@Autowired
	FactureService factureService;

	public Facture save(Facture  fac) {
		return factureService.save(fac);
	}

	public Facture  modify(Facture  fac) {
		return factureService.modify(fac);
	}

	public void remove(long idFac) {
		factureService.remove(idFac);
	}

	public Facture  getOne(long idFac) {
		return factureService.getOne(idFac);
	}

	public List<Facture > getAll() {
		return factureService.getAll();
	}
	public List<Facture > findByDescription(String description) {
		return factureService.findByDescription(description);
		}
}
