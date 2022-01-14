package cigma.pfe.models;

import java.util.Date;

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
	private Date date;

	@Transient
	double amount;
	
	public Facture() {
		
	}
	public Facture(Date date) {
		this.date = date;
	}

	public Facture(long id, Date date) {
		this.id = id;
		this.date = date;
	}
	

	
	@Override
	public String toString() {
		return "Facture{" + "id=" + id + ", date='" + date + '\'' + '}';

	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;

	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

}
