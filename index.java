import java.util.*;
import java.io.*;
public class index {

    
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
      String[] array = new String[n];

        System.out.println("Please enter names ");              
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < n;i++){

            array[i] = s1.nextLine();
           // System.out.println(array[0]+"tech"+array[1]);

        }
        System.out.println(array[0]+" tech "+array[1]);
    }
    
}