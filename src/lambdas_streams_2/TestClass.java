package lambdas_streams_2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestClass {

	@SuppressWarnings(value = "unused")
	public static void main(String[] args) {

		// Correct:

		Consumer<String> lambda1 = x -> System.out.println(x);

		Consumer<String> lambda2 = (x) -> System.out.println(x);

		Consumer<String> lambda3 = (String x) -> System.out.println(x);

		BiConsumer<String, String> lambda4 = (x, y) -> System.out.println(x + y);

		Consumer<String> lambda8 = x -> {
			x = x + "Chocolate";
			System.out.println(x);
		};

		Supplier<Double> lambda9 = () -> Math.PI;

		Supplier<Double> lambda10 = () -> {
			return Math.PI;
		};

		Function<Double, Double> lambda11 = r -> {
			double circumference = 2 * Math.PI * r;
			return circumference;
		};

		Consumer<Integer> lambda13 = (x) -> {
			x++;
			System.out.println(x);
		};

		lambda3.accept("Hello, world!");
		lambda4.accept("O_", "O");
		lambda8.accept("1 ");
		System.out.println(lambda10.get());
		System.out.println(lambda9.get());
		System.out.println(lambda11.apply(3.0));
		lambda13.accept(1);

		// Wrong:

		// Consumer<String> lambda5 = String x -> System.out.println(x);
		// BiConsumer<String, String> lambda6 = x,y -> System.out.println(x+y);
		// BiConsumer<String, String> lambda7 = (String x, y) -> System.out.println(x+y);
		// BiFunction<Integer, Integer, String> lambda12 = String::substring;
		/*
		 * Function<Double, Double> lambda11 = r -> { double circumference = 2 * Math.PI
		 * r; };
		 */
	}

}
