package it.softwareInside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.app.models.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Long>{

}
