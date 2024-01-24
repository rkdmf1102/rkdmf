import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = 20;
      String[][] abc = new String[m][3];
      String[] a = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
      String[] b = {"4.5","4.0","3.5","3.0","2.5","2.0","1.5","1.0","0.0"};
      double r = 0;
      double rr = 0;
      
      for (int i = 0; i < m; i++) {
         String n = sc.nextLine();
         abc[i] = n.split(" ");
      }
      
      for(int i=0; i<m; i++) {   
         for(int j=0; j<a.length; j++) {
            if(abc[i][2].equals(a[j])) {
               abc[i][2] = abc[i][2].replace(abc[i][2], b[j]); 
            }
         }
      }
      List<String[]> list = new ArrayList<>(Arrays.asList(abc));
      List<String[]> list2 = new ArrayList<>();
      
      for(int i=0; i<list.size(); i++) {
         if(!list.get(i)[2].equals("P")) {
         list2.add(list.get(i));
         
         }
      }
     
      
      for(int i=0; i<list2.size(); i++) {
         r += Double.parseDouble(list2.get(i)[1]) * Double.parseDouble(list2.get(i)[2]);
         rr += Double.parseDouble(list2.get(i)[1]);
      }
      System.out.printf("%.6f",r/rr);
   }
}