package Kodlama.io.Devs.Demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LanguageTechnology {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="technology_id")
	private int id;
	
	@Column(name="name")
	private String technologyName;
   
	@ManyToOne
	@JoinColumn(name="language_id")
	public ProgrammingLanguage programmingLanguage;
	
}

