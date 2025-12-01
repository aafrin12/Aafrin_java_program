import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean first = true;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                if(!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
            }
        }
    }
}
