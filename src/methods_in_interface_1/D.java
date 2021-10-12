package methods_in_interface_1;

//Java SE 7 Interfaces

public class D implements A,B {

	@SuppressWarnings(value = "unused")
	public void m() {
		int fromA = A.X;
		int fromB = B.X;
	}
	
}
