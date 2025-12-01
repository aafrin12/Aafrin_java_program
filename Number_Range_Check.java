import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int L=sc.nextInt();
        int R=sc.nextInt();
        if(L<N && R>N)
        {
            System.out.print("yes");
        }
        else{
             System.out.print("no");
        }
    }
}