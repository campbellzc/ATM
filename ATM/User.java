import java.util.Scanner;

public class User {
	private String name;
	private String pinn;
	private double balance;

	public User(String name, String pin, Double balance) {
		this.name = name;
		this.pinn = pin;
		this.balance = balance;
	}
	public void logout() {
		User nulll = new User("null", "null", 0.00);
	}
	public String name() {
		return this.name;

	}
	public void setName(String name) {
		this.name = name;
	}
	public double balance() {
		return this.balance;
	}
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	public String pinn() {
		return this.pinn;
	}
}