package cigma.pfe.models;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "unit_factures")
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String description;

	@Column
	double amount;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	
	public Facture(String description, double amount, Client client) {
		super();
		this.description = description;
		this.amount = amount;
		this.client = client;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Facture() {
		
	}
	public Facture(String description) {
		this.description = description;
	}

	public Facture(long id, String description) {
		this.id = id;
		this.description = description;
	}
	public Facture(double amount, String description) {
		this.amount = amount;
		this.description = description;
	}

	

	
	@Override
	public String toString() {
		return "Facture{" + "id=" + id + ", description='" + description + '\'' + '}';

	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getId() {
		return id;

	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
