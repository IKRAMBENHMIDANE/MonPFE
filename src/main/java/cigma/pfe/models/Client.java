package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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