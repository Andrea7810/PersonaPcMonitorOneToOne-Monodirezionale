package it.softwareInside.app.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pc {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	private String marca;
	private double prezzo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "monitor_id")
	private Monitor monitor;
	
	
	
	public Pc (String marca, double prezzo , Monitor monitor) {
		
		setMarca(marca);
		setPrezzo(prezzo);
		setMonitor(monitor);
	}
	
	
	
}
