import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        if((num1+num2)%2==0)
        {
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}