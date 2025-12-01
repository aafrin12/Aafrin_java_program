import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int size=s.length();
        char[] arr=new char[size];
         for(int i=0;i<size;i++){
            arr[i] = s.charAt(i);
        }
        if(size%2==0)
        {
            int mid1=size/2-1;
            int mid2=size/2;
            arr[mid1]='*';
            arr[mid2]='*';
        }
        else{
            int mid1=size/2;
            arr[mid1]='*';
        }
        for(int i=0;i<size;i++)
        {
            
        System.out.print(arr[i]);
        }
        
    }
}