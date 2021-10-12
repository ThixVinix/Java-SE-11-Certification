package lambdas_streams_4;

import java.util.List;
import java.util.Optional;

public class Streams2 {

	public static void main(String[] args) {
		List<String> cities;
		
		cities = List.of("Berlim", "Hamburg", "Munich", "Cologne", "Frankfurk");
		
		Optional<String> result = cities.stream()
				.filter(city -> city.contains("e"))
				.filter(city -> city.contains("l") || city.contains("a"))
				.findAny();
		
		if (result.isPresent()) {
			System.out.println(result.get());
		} else {
			System.out.println("Nenhum elemento foi encontrado");
		}
		
	}
	
}
