package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.isi.entities.Paiement;

public interface IPaiement extends JpaRepository<Paiement, Long> {

}

