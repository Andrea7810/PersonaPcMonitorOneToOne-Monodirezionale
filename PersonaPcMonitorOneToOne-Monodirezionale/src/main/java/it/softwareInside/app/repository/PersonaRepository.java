package it.softwareInside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.app.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
