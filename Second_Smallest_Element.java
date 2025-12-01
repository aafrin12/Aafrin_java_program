import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        if(n<1)
        {
            System.out.print("-1");
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]>min1&&arr[i]<min2)
            {
                min2=arr[i];
            }
        }
        if(min2==Integer.MAX_VALUE)
        {
            System.out.print("-1");
        }
        else{
            System.out.print(min2);
        }
    }
}