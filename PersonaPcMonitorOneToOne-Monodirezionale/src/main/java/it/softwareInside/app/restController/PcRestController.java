package it.softwareInside.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.app.models.Pc;
import it.softwareInside.app.service.PcService;

@RequestMapping("/api")
@RestController
public class PcRestController {

	
	@Autowired
	PcService pcService;
	
	
	
	
	@GetMapping("/all-pc")
	public Iterable<Pc> getAllPc () {
		
		return pcService.getAllPc();
	}
	
	
	
	@GetMapping("/pc-by-id")
	public Pc getPcById (Long id) {
		
		return pcService.getPcById(id);
	}
	
	
}
