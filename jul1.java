import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        double[] srr = {3.2,3.3};
        double sum = 0;   //out of loop bcz u use it for redeclaration. cant do it once u assign a value other than 0
        System.out.println(srr[1]);
        int m = srr.length;  //out of loop cz u dont want to calc the same thing again and again
        for(int i=0; i< m; i++){
            sum += srr[i];
            System.out.println(sum);
        }
        int muuu = 55;
        System.out.println("enter a number");
        int n = scanner.nextInt();
        int p = 5;
        System.out.println(muuu+n);
        System.out.println(muuu-n);
        System.out.println(muuu*n);
        System.out.println(muuu/n);
        
        if(muuu>n && muuu>p){
          System.out.println("muuu");
        }
        //StackOverflow         stackblitz    teacher'point
        
       
        String ray =scanner.next();
        String ay =scanner.next();
        System.out.println(Integer.parseInt(ray)+Integer.parseInt(ay));
  }
}
