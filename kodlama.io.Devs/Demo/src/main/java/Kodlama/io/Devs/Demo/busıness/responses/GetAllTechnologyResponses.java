package Kodlama.io.Devs.Demo.busıness.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologyResponses {
	private int id;
	private String technology;
	private String programmingLanguage;
}
