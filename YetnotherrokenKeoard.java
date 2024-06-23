import java.util.Scanner;

public class YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = Integer.valueOf(sc.nextLine());
        for(int k = 0; k<test_cases; k++){
            String input_string = sc.nextLine();
            StringBuilder ans = new StringBuilder();
            int b = 0, B = 0;
            for(int i = input_string.length() - 1; i>=0; i--){
                if(input_string.charAt(i) == 'b'){
                    b++;
                }
                else if (input_string.charAt(i) == 'B'){
                    B++;
                }
                else{
                    char character = input_string.charAt(i);
                    if((int) character >= 97 && (int) character <=122){
                        if(b == 0) ans.append(character);
                        else b--;
                    }
                    if((int) character >= 65 && (int) character <=90){
                        if(B == 0) ans.append(character);
                        else B--;
                    }
                }
            }
            System.out.println(ans.reverse().toString());
        }
    }
}
