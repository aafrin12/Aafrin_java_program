import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        char[] odd = new char[n];
        char[] even = new char[n];

        int oi = 0;  
        int ei = 0;  

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {       
                odd[oi] = s.charAt(i);
                oi++;
            } else {            
                even[ei] = s.charAt(i);
                ei++;
            }
        }


        for (int i = 0; i < oi; i++) {
            System.out.print(odd[i]);
        }

        System.out.print(" ");

    
        for (int i = 0; i < ei; i++) {
            System.out.print(even[i]);
        }
    }
}
