package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.isi.entities.Declaration;

public interface IDeclaration extends JpaRepository<Declaration, Long> {

}
