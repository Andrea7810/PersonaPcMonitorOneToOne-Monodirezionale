package it.softwareInside.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Monitor {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	
	private String marca;
	private double pollici;
	
	
	public Monitor (String marca, double pollici) {
		
		setMarca(marca);
		setPollici(pollici);	
	}
	
	
	
}
