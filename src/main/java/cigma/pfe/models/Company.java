package cigma.pfe.models;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Company {
	@EmbeddedId
	private CompanyId id;
	private String name;
	private String address;
	private String phone;
	@Embedded
	@AttributeOverride(name = "phone", column = @Column(name = "PHONE_PERSON"))
	private ContactPerson contactPerson;
}
