package cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@ToString
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(name="my_join_table_produit_facture",joinColumns = @JoinColumn(name = "produit_fk",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "facture_fk",referencedColumnName = "id"))
	private List<Facture> factures;
	
	private String name;
	private double price;

}
