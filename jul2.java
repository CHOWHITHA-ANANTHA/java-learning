//checking login
//odd or even
//calculator using switch cases



//checking login
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String username = "amruthakrishna@gmail.com";
    String pwd = "amruthakrishna";
    Scanner sc = new Scanner(System.in);
    System.out.println("name");
    String uname = sc.nextLine();
    System.out.println("pwd");
    String pd = sc.nextLine();
    if((username.equals(uname)) && (pwd.equals(pd))){        //when comparing strings, always use equals instead "=="; "==" compares the memory of the string
      System.out.println("login successful");
    } else if((username == uname) && (pwd!=pd)){   //wrong
      System.out.println("incorrect pwd");
    } else{
      System.out.println("error");
    }
  }
} 


//odd or even
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("number");
    int a = sc.nextInt();
    String mod = (a%2 == 0)? "even" : "odd";
    System.out.println(mod);
  }
}

//calculator using switch cases
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '/':
                if(num2 == 0){
                    System.out.println("invalid");
                }else{
                    System.out.println("Result: " + (num1/num2));
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

//
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("odd: ");
		for(int i =0;i<=x;i++){
		    if(i%2 != 0){
		        System.out.println( i);
		    }
		}
		System.out.println("even: ");
		for(int j =0;j<=x;j++){
		    if(j%2 == 0){
		        System.out.println(j);
		    }
		}
		System.out.println("Hello World");
	}
}


//2d arrays
import java.util.Scanner;
public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();
            int[][] array = new int[rows][cols];
            System.out.println("Enter " + (rows * cols) + " integers:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    array[i][j] = scanner.nextInt();
                }
            }
            System.out.println("\nThe 2D array is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
    }
}
