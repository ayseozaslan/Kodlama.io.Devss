package Kodlama.io.Devs.Demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.Demo.entities.concretes.LanguageTechnology;


public interface TechnologyRepository extends JpaRepository<LanguageTechnology, Integer> {
	LanguageTechnology findById(int id);
}
