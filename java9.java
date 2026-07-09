import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    try{
	        System.out.println(n/m);
	    } catch(ArithmeticException e){
	        System.out.println("cant divide by 0 try someother number");
	    } finally{
	        System.out.println("execution succes");
	    }
	}
}
