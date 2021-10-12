package lambdas_streams_4;

import java.util.List;

public class Streams {

	public static void main(String[] args) {
		List<String> cities;
		
		cities = List.of("Berlim", "Hamburg", "Munich", "Cologne", "Frankfurk");
		
		cities.stream()
		.filter(city -> city.contains("e"))
		.filter(city -> city.contains("l") || city.contains("a"))
		.forEach(System.out::println);
		
	}
	
}
