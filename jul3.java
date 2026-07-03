//factors of a number
public class Main {
    public static void main(String[] args) {
        int number = 60; 
        System.out.print("Factors of " + number + " are: ");
        
        findFactors(number);
    }
    public static void findFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
