package day5;
import java.util.*;
public class QuoAndRemainder {

	public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for dividend : ");
        int dividend = Integer.parseInt(sc.nextLine());

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Number for divisor : ");
        int divisor = Integer.parseInt(sc1.nextLine());

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }

}
