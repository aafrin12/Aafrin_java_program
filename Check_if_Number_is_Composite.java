import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        for(int i=2;i<N/2;i++)
        {
            if(N%i==0)
            {
                count++;
            }
        }
        if(count!=0)
        {
            System.out.print("yes");
        }
        else{
           System.out.print("no"); 
        }
    }
}