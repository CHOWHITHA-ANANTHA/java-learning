
//Exception handling(try catch, exceptions, finally)
//ArrayIndexOutOfBoundsException, ArithmeticException
//throw new Exception


//ArithmeticException
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
	        System.out.println("cant divide by 0 try someother number\n"+e);
	    } finally{
	        System.out.println("execution succes");
	    }
	}
}


//ArrayIndexOutOfBoundsException
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n[] = {1,2,3};
	    int m = sc.nextInt();
	    try{
	        System.out.println("the integer in the array from the desired index is: " + n[m]);
	    } catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("not found\n"+e);
	    } finally{
	        System.out.println("execution succes");
	    }
	}
}

//throw new Exception
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int balance = 25000;
	    int r = sc.nextInt();
	    try{
	        if(r> balance) throw new Exception("not enough balance\n");
	        System.out.println("money retrieved, the present balance is: " + (balance-r));
	    } catch(Exception e){
	        System.out.println(e.getMessage());
	    } finally{
	        System.out.println("execution succes");
	    }
	}
}
