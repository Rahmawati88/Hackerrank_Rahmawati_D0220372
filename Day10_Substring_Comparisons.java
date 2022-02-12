import java.util.Scanner;
    public class Day10_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int lastIndex = s.length()-k;
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(int i=0; i<=lastIndex; i++){
            String sub = s.substring(i, i+k);
            //System.out.println(sub);
            if(smallest.compareTo(sub)>0){
                smallest = sub;
        }
        if (largest.compareTo(sub)<0){
            largest = sub;
        }
        }
        
        
        return smallest + "\n" + largest;
    }


}
