package sn.isi.service;

import java.util.List;

import sn.isi.entities.Paiement;

public interface PaiementService {
	
	Paiement creer(Paiement Paiement);
	
	List<Paiement> lire(); 
	
	Paiement modifier(Long id, Paiement declarant);
	
	String supprimer(Long id);

}
