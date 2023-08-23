package sn.isi.service;

import java.util.List;

import sn.isi.entities.Declarant;

public interface DeclarantService {
	
	Declarant creer(Declarant declarant);
	
	List<Declarant> lire(); 
	
	Declarant modifier(Long id, Declarant declarant);
	
	String supprimer(Long id);

}
