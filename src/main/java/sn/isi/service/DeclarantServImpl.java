package sn.isi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sn.isi.dao.IDeclarant;
import sn.isi.entities.Declarant;

@Service
@AllArgsConstructor
public class DeclarantServImpl implements DeclarantService{
	
	private final IDeclarant iDeclarant = null;

	@Override
	public Declarant creer(Declarant declarant) {
		// TODO Auto-generated method stub
		return iDeclarant.save(declarant);
	}

	@Override
	public List<Declarant> lire() {
		// TODO Auto-generated method stub
		return iDeclarant.findAll();
	}

	@Override
	public Declarant modifier(Long id, Declarant declarant) {
		// TODO Auto-generated method stub
		return iDeclarant.findById(id)
				.map(d-> {
					d.setRaisonSociale(declarant.getRaisonSociale());
					d.setAdresse(declarant.getAdresse());
					d.setEmail(declarant.getEmail());
					d.setTelephone(declarant.getTelephone());
					return iDeclarant.save(d);
				}).orElseThrow(() -> new RuntimeException("Déclarant introuvable !!!"));
	}

	@Override
	public String supprimer(Long id) {
		// TODO Auto-generated method stub
		iDeclarant.deleteById(id);
		return "Déclarant Supprimé";
	}

}
