import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day21_BigInteger {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    BigInteger A = new BigInteger(a);
    BigInteger B = new BigInteger(b);
    BigInteger C = A.add(B);
    BigInteger D = A.multiply(B);
    System.out.println(C);//Hasil penjumlahan
    System.out.println(D);//Hasil perkalian
    }
}