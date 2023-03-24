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
public class Persona {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	private String nome;
	private String cognome;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_id")
	private Pc pc;
	
	
	public Persona (String nome, String cognome , Pc pc) {
		
		setNome(nome);
		setCognome(cognome);
		setPc(pc);
	}
	
	
	
}
