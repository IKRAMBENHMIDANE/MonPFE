package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository {
	public ClientRepositoryImpl() {
		System.out.println("CallClientRepositoryImpl ....");
	}

	@Override
	public Client save(Client c) {
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		return null;
	}

}