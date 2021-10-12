package type_inference;

import java.util.ArrayList;

public class Examples {

	// Where Can It Not Be Used:
	// public var price;

//	public var getPrice() {
//		return price;
//	}

	@SuppressWarnings(value = { "unused" })
	public static void main(String[] args) {

		// Where Can It Be Used:

		String[] itemArray = { "A", "B" };
		for (var item : itemArray) {
		}

		for (var i = 0; i < itemArray.length; i++) {
			String string = itemArray[i];
		}

		var x = new StringBuilder();

		var list = new ArrayList<Integer>(); // list is inferred as ArrayList, not List.

		// Take Care Using 'var' with Literals:
		var itemDescription = "Shirt";
		var ready = true;
		var ch = '\ufffd';
		var sum = 0L;
		var flags = 0;
		var mask = 0x7fff;
		var f1 = 1.0f;
		var f2 = 2.0; // inferred as double
		var d3 = 3.0;
		var d4 = 4.0f; // inferred as float

		// Where Can It Not Be Used:

		// var price;

		// var price = null;

		// var price = 9.95, tax = 0.05;

		// var prices = {9.95, 5, 3.50};

		// (var x, y) -> x.process(y)

		// (var x, int y) -> x.process(y)

		// var x -> x.toString();
	}

}
