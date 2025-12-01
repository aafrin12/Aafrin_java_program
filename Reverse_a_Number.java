import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.charAt(i)-'0';
        }
        for(int i=n-1;i>=0;i--)
        {
          if(arr[i]==0)
          {
              continue;
          }
          else{
              System.out.print(arr[i]);
          }
        }
    }
}