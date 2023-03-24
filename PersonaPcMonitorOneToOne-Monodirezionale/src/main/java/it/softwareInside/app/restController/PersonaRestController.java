package it.softwareInside.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.app.models.Persona;
import it.softwareInside.app.service.PersonaService;

@RequestMapping("/api")
@RestController
public class PersonaRestController {

	
	@Autowired
	PersonaService pService;
	
	
	
	@PostMapping("/add-persona")
	public boolean addPersona (@RequestBody Persona persona) {
		
		return pService.addPersona(persona);
	}
	
	
	
	@DeleteMapping("/delete-all") 
	public boolean removeAll () {
		
		return pService.removeAll();
	}
	
	
	
	@DeleteMapping("/remove-persona-id")
	public Persona removePersonaById (@RequestParam (name = "id") Long id) {
		
		return pService.removePersonaById(id);
	}
	
	
	
	
	@GetMapping("/get-all-persone")
	public Iterable<Persona> getAll () {
		
		return pService.getAll();
	}
	
	
	
	
	
	
	
}
