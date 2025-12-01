import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine().toLowerCase();
        
        boolean hasVowel = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                hasVowel = true;
                break;
            }
        }

        if (hasVowel)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
