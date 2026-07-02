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
    if((username.equals(uname)) && (pwd.equals(pd))){
      System.out.println("login successful");
    } else if((username == uname) && (pwd!=pd)){
      System.out.println("incorrect pwd");
    } else{
      System.out.println("error");
    }
  }
}
