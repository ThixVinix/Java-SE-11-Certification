package lambdas_streams_3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

	@SuppressWarnings(value = "unused")
	public static void main(String[] args) {

		// Use lambda:
		Consumer<String> lambda1 = x -> System.out.println(x);

		// Or Method Reference:

		// For any instance:
		Consumer<String> lambda2 = System.out::println;

		// Or for a particular instance:
		 var city = "Munich";
		Supplier<String> lambda3 = city::toUpperCase;
		System.out.println(lambda3.get());

		// For static methods:

		Function<Integer, String> lambda4 = x -> Integer.toBinaryString(x);
		Function<Integer, String> lambda5 = Integer::toBinaryString;
		
		// For printing:
		
		Consumer<String> lambda6 = x -> System.out.println(x);
		Consumer<String> lambda7 = System.out::println;
		
	}

}
