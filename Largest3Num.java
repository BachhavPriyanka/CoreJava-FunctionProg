package day5;

public class Largest3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30, b = 40, c = 50;
		System.out.println("A = " + a + " B = " + b + " C = " + c);
		if(a > b) {
			if(a > c) {
				System.out.println(a + "is greater");			}
		else {
			System.out.println(c + " is greater");
		}
		}else {
			if(b > c) {
			System.out.println(b + " is greater");
		}else {
			System.out.println(c + " is greater");
		}
	}

}
}
