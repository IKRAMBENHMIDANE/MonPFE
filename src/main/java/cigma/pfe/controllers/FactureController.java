package cigma.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.FactureService;

@Controller("controller2")
public class FactureController {
	@Autowired
	FactureService factureService;
	
	public FactureController ( FactureService factureService) {
		System.out.println("Call FactureController with factureServiceparam....");
		this.factureService = factureService;
	}

	public FactureController() {
		System.out.println("CallFactureController ....");
	}
	public void create(Facture f) {
		System.out.println("FactureController level...");
		factureService.create(f);
	}
	public void update(Facture f) {
		System.out.println("FcatureController level...");
		factureService.update(f);
	}
	public void delete(Facture f) {
		System.out.println("FactureController level...");
		factureService.delete(f);
	}
	public Facture read(Facture f){
		return factureService.read(f);
		}

}
