import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Math.abs(sc.nextInt());
        int M=Math.abs(sc.nextInt());
        int max=0;
        if (N == 0 || M == 0) {
            System.out.println(-1);
            return;
        }
        for(int i=1;i<=N&&i<=M;i++)
        {
            if(N%i==0 && M%i==0)
            {
                max=i;
            }
        }
        if(max!=0)
        {
        System.out.print(max);
        }
        else{
             System.out.print("-1");
        }
    }
}