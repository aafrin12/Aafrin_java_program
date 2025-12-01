import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        int index=-1;
        int c=0;
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n1-1;i++)
        {
            if(arr1[i]>arr1[i+1])
            {
                c++;
                index=i;
            }
        }
        if(c==1)
        {
            System.out.print(index);
        }
        else{
            System.out.print("-1");
        }
    }
    
}