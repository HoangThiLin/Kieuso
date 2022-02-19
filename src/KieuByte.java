import java.util.Scanner;

public class KieuByte {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Nhập vào số a: ");
	    byte a = input.nextByte();
	    System.out.print("Nhập vào số b: ");
	    byte b = input.nextByte();
	    System.out.println(a+"+"+b+"="+(a+b));
	    System.out.println(a+"-"+b+"="+(a-b));
	    System.out.println(a+"*"+b+"="+(a*b));
	    System.out.println(a+"/"+b+"="+(a/b));
	    System.out.println(a+"%"+b+"="+(a%b));

	}

}
