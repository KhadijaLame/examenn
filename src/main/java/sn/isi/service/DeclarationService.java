package sn.isi.service;

import java.util.List;

import sn.isi.entities.Declaration;

public interface DeclarationService {
	
	Declaration creer(Declaration declaration);
	
	List<Declaration> lire(); 
	
	Declaration modifier(Long id, Declaration declarant);
	
	String supprimer(Long id);

}
