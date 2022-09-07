package day5;
import java.util.*;
public class LeapYear {

	 public static void main(String args[]){
		// TODO Auto-generated method stub
	        int year;
	        System.out.println("Enter a Year: ");
	        Scanner sc = new Scanner(System.in);
	        year = sc.nextInt();

	        if(((year % 4 == 0) && (year % 100 != 0 )) || (year % 400 == 0)){

	           System.out.println(year + " is a Leap Year");
	     }
	        else {
	            System.out.println(year + " is a Not a Leap Year");
	     }
	    }
}
