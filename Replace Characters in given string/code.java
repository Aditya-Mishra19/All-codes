import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String s = scanner.nextLine();
        
        // Input characters to be replaced
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);
        
        // Resultant string after replacement
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ch1) {
                res.append(ch2);
            } else if (c == ch2) {
                res.append(ch1);
            } else {
                res.append(c);
            }
        }
        
        System.out.println(res.toString());
    }
}
