import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int count=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            System.out.print("no");
        }
        else{
            System.out.print("yes");
        }
    }
}