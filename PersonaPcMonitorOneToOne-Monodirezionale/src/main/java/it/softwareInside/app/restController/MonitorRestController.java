package it.softwareInside.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.app.models.Monitor;
import it.softwareInside.app.service.MonitorService;

@RequestMapping("/api")
@RestController
public class MonitorRestController {

	
	
	@Autowired
	MonitorService monService;
	
	
	
	@GetMapping("/all-mon") 
	public Iterable<Monitor> getAllPc () {
		
		return monService.getAllMon();
	}
	
	
	
	
	@GetMapping("/mon-by-id") 
	public Monitor getMonById (Long id) {
		
		return monService.getMonById(id);
	}
	
	
	
}
