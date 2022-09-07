package day5;

import java.util.Scanner;

public class Swap2Num {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First Number:");
	    int firstNum = sc.nextInt();
	
	    System.out.println("Enter Second Number:");
	    int secondNum = sc.nextInt();
	
	    firstNum = firstNum - secondNum;
	    secondNum = firstNum + secondNum;
	    firstNum = secondNum - firstNum;
	
	    System.out.println("****After Swaping Numbers****");
	    System.out.println("First Number:" + firstNum);
	    System.out.println("Second Number:" + secondNum);

	}

}
