import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		if( x<=100 && x>=90 ) {
			System.out.println("A");
		} else if( x<=89 && x>=80) {
			System.out.println("B");
		} else if( x<=79 && x>=70) {
			System.out.println("C");
		} else if( x<=69 && x>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}