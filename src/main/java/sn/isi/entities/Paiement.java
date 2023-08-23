package sn.isi.entities;

import java.sql.Date;

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
@Table(name = "PAIEMENT")
public class Paiement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100, nullable = false)
	private Date datePaiement;
	@Column(length = 100, nullable = false)
	private Double montantPaiement;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Declaration_ID")
	private Declaration declaration;

	public Paiement(Long id, Date datePaiement, Double montantPaiement, Declaration declaration) {
		super();
		this.id = id;
		this.datePaiement = datePaiement;
		this.montantPaiement = montantPaiement;
		this.declaration = declaration;
	}

	public Paiement() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public Double getMontantPaiement() {
		return montantPaiement;
	}

	public void setMontantPaiement(Double montantPaiement) {
		this.montantPaiement = montantPaiement;
	}

	public Declaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}

	 
	

}
