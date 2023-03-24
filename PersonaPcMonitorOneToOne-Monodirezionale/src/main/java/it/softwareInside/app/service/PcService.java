package it.softwareInside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.app.models.Pc;
import it.softwareInside.app.repository.PcRepository;

@Service
public class PcService {

	
	
	@Autowired
	PcRepository pcRepository;
	
	
	/**
	 * Ritorna lista di tutti i Pc.
	 * @return
	 */
	public Iterable<Pc> getAllPc () {
		
		return pcRepository.findAll();
	}
	
	/**
	 * Ritorna un pc all'id che viene dato in input.
	 * @param id
	 * @return
	 */
	public Pc getPcById (Long id) {
		
		try {
			
			return pcRepository.findById(id).get();
			
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
