package Kodlama.io.Devs.Demo.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "technologies"})
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="language_id")
	private int id;
	
	@Column(name="language")
	private String language;
	
	@OneToMany(mappedBy="programmingLanguage", cascade = CascadeType.ALL) 
	// en iyi örnek; programming language anne,
	//yani one to many birden çoğa demek, many to one -çoktan bire- olan nesneler için çocuklar gibi düşünebilirsin.
	private List<LanguageTechnology> technologies;
	
}
