import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine()), t = new StringBuilder(sc.nextLine());
        String ans = s.reverse().toString().equals(t.toString()) ? "YES" : "NO";
        System.out.println(ans);
    }
}
