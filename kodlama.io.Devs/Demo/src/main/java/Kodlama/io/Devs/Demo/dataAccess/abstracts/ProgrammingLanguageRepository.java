package Kodlama.io.Devs.Demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.Demo.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {
	ProgrammingLanguage findById(int id);
}
