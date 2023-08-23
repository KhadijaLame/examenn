package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.isi.entities.Declarant;

public interface IDeclarant extends JpaRepository<Declarant, Long> {

}
