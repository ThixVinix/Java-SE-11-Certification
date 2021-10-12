package methods_in_interface_3;

public interface Accessible {

	public default double verifyDeposit(double amount, int pin) {
		// Verify the PIN
		// Verify amount is greater than 0
		return 0;
	}

	public default double verifyWithdraw(double amount, int pin) {
		// Verify the PIN
		// Verify amount is greater than 0
		// Verify account balance won't go negative
		return 0;
	}

}
