package sn.isi.entities;


import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "DECLARANT")
public class Declarant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Column(length = 100, nullable = false)
	private String raisonSociale;
	@Column(length = 100, nullable = false)
	private String adresse;
	@Column(length = 100, nullable = false)
	private String email;
	@Column(length = 100, nullable = false)
	private String telephone;
	
	@OneToMany(mappedBy ="declarant")
	private List<Declaration> declaration = new ArrayList<Declaration>();
	
	public Declarant() {
		super();
	}

	public Declarant(Long id, String raisonSociale, String adresse, String email, String telephone,
			List<Declaration> declaration) {
		super();
		this.id = id;
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.declaration = declaration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}
	
	

}