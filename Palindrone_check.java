import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
