import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] arr=new int[N];
        boolean found=false;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(arr[i]==K)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
}