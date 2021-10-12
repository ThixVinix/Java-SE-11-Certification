package methods_in_interface_2;

public interface Accessible {

	public static final double OVERDRAFT_FEE = 25;

	public abstract double verifyDeposit(double amount, int pin);

	public abstract double verifyWithdraw(double amount, int pin);

}
