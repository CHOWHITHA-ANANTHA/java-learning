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

