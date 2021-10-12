package methods_in_interface_3;

//Java SE 8 Interfaces

public class BasicChecking implements Accessible {

	@Override
	public double verifyDeposit(double amount, int pin) {
		// Call the interface's implementation
		return Accessible.super.verifyDeposit(amount, pin);
		// Verify the withdrawal is under the transaction limit
	}

	@Override
	public double verifyWithdraw(double amount, int pin) {
		return Accessible.super.verifyWithdraw(amount, pin);
	}

}
