package sn.isi.service;

import java.util.List;

import sn.isi.dao.IPaiement;
import sn.isi.entities.Paiement;

public class PaiementServImpl implements PaiementService {
	
	private final IPaiement iPaiement = null;

	@Override
	public Paiement creer(Paiement paiement) {
		// TODO Auto-generated method stub
		return iPaiement.save(paiement);
	}

	@Override
	public List<Paiement> lire() {
		// TODO Auto-generated method stub
		return iPaiement.findAll();
	}

	@Override
	public Paiement modifier(Long id, Paiement paiement) {
		// TODO Auto-generated method stub
		return iPaiement.findById(id)
				.map(p-> {
					p.setDatePaiement(paiement.getDatePaiement());
					p.setMontantPaiement(paiement.getMontantPaiement());
					return iPaiement.save(p);
				}).orElseThrow(() -> new RuntimeException("Déclarant introuvable !!!"));
	}

	@Override
	public String supprimer(Long id) {
		// TODO Auto-generated method stub
		iPaiement.deleteById(id);
		return "Paiement Supprimé";
	}

}
