import java.util.Scanner;

public class KieuDouble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Nhập vào số a: ");
	    double a = input.nextDouble();
	    System.out.print("Nhập vào số b: ");
	    double b = input.nextDouble();
	    System.out.println(a+"+"+b+"="+(a+b));
	    System.out.println(a+"-"+b+"="+(a-b));
	    System.out.println(a+"*"+b+"="+(a*b));
	    System.out.println(a+"/"+b+"="+(a/b));
	}

}
