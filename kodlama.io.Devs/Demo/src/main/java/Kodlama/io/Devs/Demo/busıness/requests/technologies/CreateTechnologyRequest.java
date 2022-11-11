package Kodlama.io.Devs.Demo.busıness.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechnologyRequest {
	
	private int mainLanguageId;
	private String technology;

}
