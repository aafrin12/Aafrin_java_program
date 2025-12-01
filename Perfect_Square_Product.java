import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
       int s=N*M;
       if(Math.sqrt(s)==(int)Math.sqrt(s))
       {
           System.out.print("yes");
       }
       else{
           System.out.print("no");
       }
    }
}