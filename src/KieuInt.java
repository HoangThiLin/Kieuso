import java.util.Scanner;
public class KieuInt {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	    System.out.print("Nhập vào số a: ");
	    int a = input.nextInt();
	    System.out.print("Nhập vào số b: ");
	    int b = input.nextInt();
	    System.out.println(a+"+"+b+"="+(a+b));
	    System.out.println(a+"-"+b+"="+(a-b));
	    System.out.println(a+"*"+b+"="+(a*b));
	    System.out.println(a+"/"+b+"="+(a/b));
	    System.out.println(a+"%"+b+"="+(a%b));
	}
}
