package it.softwareInside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.app.models.Persona;
import it.softwareInside.app.repository.PersonaRepository;

@Service
public class PersonaService {

	
	@Autowired
	PersonaRepository persRepository;
	
	/**
	 * Aggiunge una persona prendendo in input una persona
	 * e un pc (relazione OneToOne con Persona) e un monitor
	 * (relazione OneToOne con Pc). Ritorna true se aggiunta,
	 * false se va in eccezione.
	 * @param persona
	 * @return
	 */
	public boolean addPersona (Persona persona) {
		
		try {
			
			persRepository.save(persona);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	/**
	 * Elimina tutte le persone e i relativi pc/monitor
	 * torna true se riesce sennò torna false.
	 * @return
	 */
	public boolean removeAll () {
		
		try {
			
			persRepository.deleteAll();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	/**
	 * Prende in input un id e rimuove la persona e
	 * il relativo pc/monitor dal database tornando la persona rimossa.
	 * @param id
	 * @return
	 */
	public Persona removePersonaById (Long id) {
		
		try {
			
			Persona p = persRepository.findById(id).get();
			persRepository.deleteById(id);
			return p;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	
	/**
	 * Torna una lista di tutte le persone e i relativi 
	 * Pc/monitor.
	 * @return
	 */
	public Iterable<Persona> getAll () {
		
		try {
			return persRepository.findAll();
			
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
}
