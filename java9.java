
//Exception handling(try catch, exceptions, finally)
//ArrayIndexOutOfBoundsException, ArithmeticException
//throw new Exception e.getClass().getName()


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





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            int n = sc.nextInt();
            int m = sc.nextInt();     			//the input must be in try block so the string inputs, will be tried and raised an exception, or else, it shows an error.
            System.out.println(n/m);
        } catch(ArithmeticException e){
            System.out.println(e);								//prints java.lang.ArithmeticException: / by zero
        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());			//prints java.util.InputMismatchException
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
//throw new Exception
public class Main {
    static void game(){
        try{
            throw new NullPointerException("demo");
        } catch(NullPointerException e){
            System.out.println("error in fun");
            throw e;
        }
    } 
	public static void main(String[] args) {
	    try{
	        game();
	    } catch(NullPointerException e){
	        System.out.println(e.getMessage());
	    } finally{
	        System.out.println("execution succes");
	    }
	}
}
