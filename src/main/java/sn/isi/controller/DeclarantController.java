package sn.isi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sn.isi.entities.Declarant;
import sn.isi.service.DeclarantService;

@RestController
@RequestMapping("/declarant")
@AllArgsConstructor
public class DeclarantController {
	
	private final DeclarantService declarantService = null;
	
	@PostMapping("/create")
	public Declarant create(@RequestBody Declarant declarant) {
		return declarantService.creer(declarant);
		
	}
	
	@GetMapping("/read")
	public List<Declarant> read() {
		return declarantService.lire();
	}
	
	@PutMapping("/update/{id}")
	public Declarant update(@PathVariable Long id, @RequestBody Declarant declarant) {
		return declarantService.modifier(id, declarant);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		return declarantService.supprimer(id);
	}
}
