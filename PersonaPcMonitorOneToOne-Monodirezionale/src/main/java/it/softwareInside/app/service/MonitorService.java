package it.softwareInside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.app.models.Monitor;
import it.softwareInside.app.repository.MonitorRepository;

@Service
public class MonitorService {

	
	@Autowired
	MonitorRepository monRepository;
	
	/**
	 * Torna lista di tutti i monitor.
	 * @return
	 */
	public Iterable<Monitor> getAllMon () {
		
		return monRepository.findAll();
	}
	
	
	/**
	 * Torna un monitor all'id messo in input.
	 * @param id
	 * @return
	 */
	public Monitor getMonById (Long id) {
		
		try {
			return monRepository.findById(id).get();
			
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
	
}
