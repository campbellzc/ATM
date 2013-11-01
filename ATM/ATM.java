import java.util.Scanner;

public class ATM {
	private User activeUser;
	private User account1 = new User("Bob", "1234", 200.00);
	private User account2 = new User("Alice", "6868", 350.00);
	private User account3 = new User("JT", "1111", 999999999.00);
	private User[] users = {account1, account2, account3};
	Scanner username = new Scanner(System.in);
	Scanner pin = new Scanner(System.in);
	Scanner menuReader = new Scanner(System.in);
	Scanner takeMoney = new Scanner(System.in);
	public ATM() {
		logIn();
		menu();
	}
	public void logIn() {
		
		String name;
		String pinNumber;
		
		
		int y = -1;
		
		while(y == -1) {
                        System.out.println("Please enter your username: ");
                        name = username.nextLine();
                        
                        for (int i = 0; i < users.length; i++) {
                                if (name.equals(users[i].name())) {
                                        y = i;
                                }
                        }
                        if (y == -1) {
                                System.out.println("No account with that name");
                        } else {
                                System.out.println("Please enter your PIN: ");
                                pinNumber = pin.nextLine();
                                if (pinNumber.equals(users[y].pinn())) {
                                        System.out.println("Thank you for logging in!");
                                        
                                } else {
                                        System.out.println("PIN incorrect");
                                        y = -1;
                                }
                        }
        }
		this.activeUser = users[y];
	}
	
	public void menu() {
		System.out.println("Press 1 to check your balance.");
		System.out.println("Press 2 to withdrawl funds.");
		System.out.println("Press 3 to logout.");
		String num = menuReader.nextLine();
		if (num.equals("1")) {
			checkBalance();
		} else if(num.equals("2")) {
			withdrawl();
		} else if(num.equals("3")) {
			logout();
		} else {
			System.out.println("Enter a number between 1 and 3 please.");
			menu();
		}


	}
	public void withdrawl() {
		System.out.println("Your current balance is: " + activeUser.balance());
		System.out.println("How much would you like to withdrawl?");
		
		double money;
		money = takeMoney.nextDouble();
		activeUser.setBalance(activeUser.balance() - money);
		System.out.println("Your new balance is: " + activeUser.balance());
		menu();
		
	}
	public void checkBalance() {
		System.out.println("Your current balance is: " + activeUser.balance());
		menu();
		
		
		
	}
	public void logout() {
		System.out.println("Thank you for using the ATM!");
		activeUser.logout();
		
	}
	
}