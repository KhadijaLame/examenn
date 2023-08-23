package sn.isi.service;

import java.util.List;

import sn.isi.dao.IDeclaration;
import sn.isi.entities.Declaration;

public class DeclarationServImpl implements DeclarationService {

	private final IDeclaration iDeclaration = null;

	@Override
	public Declaration creer(Declaration declaration) {
		// TODO Auto-generated method stub
		return iDeclaration.save(declaration);
	}

	@Override
	public List<Declaration> lire() {
		// TODO Auto-generated method stub
		return iDeclaration.findAll();
	}

	@Override
	public Declaration modifier(Long id, Declaration declaration) {
		// TODO Auto-generated method stub
		return iDeclaration.findById(id)
				.map(de-> {
					de.setDateDeclaration(declaration.getDateDeclaration());
					de.setMontantDeclaration(declaration.getMontantDeclaration());
					de.setIdDeclarant(declaration.getIdDeclarant());
					return iDeclaration.save(de);
				}).orElseThrow(() -> new RuntimeException("Déclarant introuvable !!!"));
	}

	@Override
	public String supprimer(Long id) {
		// TODO Auto-generated method stub
		iDeclaration.deleteById(id);
		return "Déclaration supprimé";
	}

}
