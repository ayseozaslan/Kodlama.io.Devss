package Kodlama.io.Devs.Demo.busıness.abstracts;

import java.util.List;

import Kodlama.io.Devs.Demo.busıness.requests.technologies.CreateTechnologyRequest;
import Kodlama.io.Devs.Demo.busıness.requests.technologies.UpdateTechnologyRequest;
import Kodlama.io.Devs.Demo.busıness.responses.GetAllTechnologyResponses;
import Kodlama.io.Devs.Demo.entities.concretes.LanguageTechnology;

public interface TechnologyService {
       List<GetAllTechnologyResponses> getAll();
       void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
       void delete(int id);
	LanguageTechnology getById(int id);
	void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception;
	
}
