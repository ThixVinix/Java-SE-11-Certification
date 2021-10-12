package lambdas_streams_4;

import java.util.List;

public class Streams3 {

	public static void main(String[] args) {
		
		List<String> cities;
		cities = List.of("Berlim", "Hamburg", "Munich", "Cologne", "Frankfurk");
		
		String result = cities.stream()
				.filter(city -> city.contains("e"))
				.filter(city -> city.contains("l") || city.contains("a"))
				.findAny().get();
		
			System.out.println(result);
		
	}
	
	
	
}
