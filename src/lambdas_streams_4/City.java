package lambdas_streams_4;

import java.util.List;

public class City {

	private String name;

	private Long population;
	
	public City(String name, Long population) {
		this.name = name;
		this.population = population;
	}
	
	public static void main(String[] args) {
		var cities = List.of(new City("Berlim", 3500000L),
				new City("Hamburg", 1790000L),
				new City("Munich", 1450000L),
				new City("Cologne", 1060000L),
				new City("Frankfurt", 730000L));	
		
	City result = cities.stream()
		.filter(City::verificarPopulacao)
		.findFirst()
		.orElse(new City("Not Found", 0L));
		
		System.out.println(result.name);
		
		
	}

	private static boolean verificarPopulacao(City city) {
		return city.getPopulation() < 1000000L;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}
}
