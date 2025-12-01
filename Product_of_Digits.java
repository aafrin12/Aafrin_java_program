import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int product=1;
        while(temp>0)
        {
            temp/=10;
            count++;
        }
        int[] arr = new int[count];
        temp = n;
        for (int i = count - 1; i >= 0; i--) {
             arr[i] = temp % 10;
              temp /= 10;
          }
          for(int i=0;i<count;i++)
          {
              product=product*arr[i];
          }
          System.out.print(product);

    }
}