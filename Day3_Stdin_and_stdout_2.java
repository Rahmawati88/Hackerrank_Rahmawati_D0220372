import java.util.Scanner;


public class Day3_Stdin_and_stdout_2 {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int i = sn.nextInt();
        double d = sn.nextDouble();
        sn.nextLine();
        String s = sn.nextLine();
        
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
