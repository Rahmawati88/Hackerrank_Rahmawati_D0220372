import java.io.*;
import java.util.*;
public class Day13_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[!,?._'@\\s]+"," ");
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        System.out.println(n);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}

