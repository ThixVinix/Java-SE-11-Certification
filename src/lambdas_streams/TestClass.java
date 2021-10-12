package lambdas_streams;

//Functional Programming

public class TestClass {

	FuncInterface lambda = x -> 2.0 * x;

	public static void main(String[] args) {
		TestClass instance = new TestClass();
		instance.callAbstractMethod(); // Prints 6.0
		instance.changeLambda(x -> 3 * x);
		instance.callAbstractMethod(); // Prints 9.0
	}

	public void callAbstractMethod() {
		System.out.println(lambda.abstractMethod(3));
	}

	public void changeLambda(FuncInterface lambda) {
		this.lambda = lambda;
	}
}
