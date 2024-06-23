import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = Integer.valueOf(sc.nextLine());
        for(int k = 0; k<test_cases; k++){
            StringBuilder current_square = new StringBuilder(sc.nextLine());
            int current_row = Character.getNumericValue(current_square.charAt(1));
            char current_column = current_square.charAt(0);
            List<String> ans = new ArrayList<String>();
            for(int i = 1; i<9; i++){
                if(i != current_row){
                    StringBuilder square_to_add = new StringBuilder();
                    square_to_add.append(current_column);
                    square_to_add.append(i);
                    ans.add(square_to_add.toString());
                }
                if(i != (int) current_column - 96){
                    StringBuilder square_to_add = new StringBuilder();
                    square_to_add.append((char) (96 + i));
                    square_to_add.append(current_row);
                    ans.add(square_to_add.toString());
                } 
            }
            for(String square:ans){
                System.out.println(square);
            }
        }
            
    }
}
