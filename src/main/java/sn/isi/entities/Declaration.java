package sn.isi.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DECLARATION")
public class Declaration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100, nullable = false)
	private Date dateDeclaration;
	@Column(length = 100, nullable = false)
	private Double montantDeclaration;
	@Column(length = 100, nullable = false)
	private Long idDeclarant;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Declarant_ID")
	private Declarant declarant;
	
	@OneToMany(mappedBy ="declaration")
	private List<Paiement> paiements = new ArrayList<Paiement>();

	public Declaration(Long id, Date dateDeclaration, Double montantDeclaration, Long idDeclarant, Declarant declarant,
			List<Paiement> paiements) {
		super();
		this.id = id;
		this.dateDeclaration = dateDeclaration;
		this.montantDeclaration = montantDeclaration;
		this.idDeclarant = idDeclarant;
		this.declarant = declarant;
		this.paiements = paiements;
	}

	public Declaration() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	public Double getMontantDeclaration() {
		return montantDeclaration;
	}

	public void setMontantDeclaration(Double montantDeclaration) {
		this.montantDeclaration = montantDeclaration;
	}

	public Long getIdDeclarant() {
		return idDeclarant;
	}

	public void setIdDeclarant(Long idDeclarant) {
		this.idDeclarant = idDeclarant;
	}

	public Declarant getDeclarant() {
		return declarant;
	}

	public void setDeclarant(Declarant declarant) {
		this.declarant = declarant;
	}

	public List<Paiement> getPaiements() {
		return paiements;
	}

	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}
	


	
	

}
