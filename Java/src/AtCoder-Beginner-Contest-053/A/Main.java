import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		var num = scanner.nextInt();
		if (num < 1200) {
			System.out.println("ABC");
		} else {
			System.out.println("ARC");
		}

		scanner.close();
	}
}
