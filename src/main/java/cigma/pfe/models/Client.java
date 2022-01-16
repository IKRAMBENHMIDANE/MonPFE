package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "unit_clients")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public Client(String name) {
		this.name = name;
	}

	public Client(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Client() {
		System.out.println("CLIENT");
	}

	@Column
	private String name;
	
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private List<Facture> factures;
	
	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(name = "client_fk",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "promotion_fk",referencedColumnName = "id"))
	private List<Promotion> promotions;
	
	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public CarteFidelio getCarteFidelio() {
		return carteFidelio;
	}

	public void setCarteFidelio(CarteFidelio carteFidelio) {
		this.carteFidelio = carteFidelio;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	@Override
	public String toString() {
		return "Client{" + "id=" + id + ", name='" + name + '\'' + '}';

	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

}