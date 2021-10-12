package methods_in_interface_2;

//Java SE 7 Interfaces

public class RestrictedChecking implements Accessible {

	public double verifyDeposit(double amount, int pin) {
		// Verify the PIN
		// Verify amount is greater than 0
		return 0;
	}

	public double verifyWithdraw(double amount, int pin) {
		// Verify the PIN
		// Verify amount is greater than 0
		// Verify account balance won't go negative
		// Verify the withdrawal is under the transaction limit
		return 0;
	}

}
