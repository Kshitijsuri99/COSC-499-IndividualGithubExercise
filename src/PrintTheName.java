//importing scanner
import java.util.Scanner;
public class PrintTheName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Asking for name
		System.out.println("Enter your name:");
		String name = in.nextLine();
		//Displaying the name 
		System.out.println("Your Name is: " + name);

	}

}
