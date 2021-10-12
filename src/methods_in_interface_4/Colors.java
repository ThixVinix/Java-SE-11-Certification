package methods_in_interface_4;

public class Colors implements Black, Red, Gold {

	public static void main(String[] args) {
		Colors colors = new Colors();
		colors.getColor();
	}

	@Override
	public void getColor() {
		Black.super.getColor();
	}

}
