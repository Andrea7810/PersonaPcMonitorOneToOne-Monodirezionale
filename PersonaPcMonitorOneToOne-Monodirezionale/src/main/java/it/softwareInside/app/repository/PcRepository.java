package it.softwareInside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.app.models.Pc;

public interface PcRepository extends JpaRepository<Pc, Long>{

}
