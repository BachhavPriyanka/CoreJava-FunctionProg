package day5;
import java.util.*;
public class PowerOfTwo {

	 public static void main(String args[] ) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number for exponent:");
		 int n = sc.nextInt();
		 int base = 2;
		 int result = 1;
		 	while (n > 0) {
		 		result = result * base;
		 		n--;
		 	}
		 	System.out.println(result);
	 }
}
