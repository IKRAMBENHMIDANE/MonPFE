package cigma.pfe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;


public class MonApplication {
	public static void main(String[] args) {
		
		/*ClientController ctrl1 = new ClientController();
		Client client = new Client(1L, "testing");
		ctrl1.save(client);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController)context.getBean("controller1");
		
		Client client = new Client("NADA");
		
		ctrl.save(client);
		
		



	}
}