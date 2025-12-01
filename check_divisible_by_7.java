import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        if(num%7==0)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
            
        }
    }
}