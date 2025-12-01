import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] arr=new int[N];
        int count=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(arr[i]==K)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.print(count);
        }
        else{
            System.out.print(-1);
        }
    }
}