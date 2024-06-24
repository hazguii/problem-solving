import java.util.List;

public class StringToIntegerATOI {
    public static int myAtoi(String s) {
        if (s.length() == 0) return 0;
        // removing leading spaces
        while(true) {
            if (s.startsWith(" ")) s = s.replaceFirst(" ", "");
            else break;
        }

        // removing sign if exists and storing it
        char sign;
        if (s.startsWith("-")) {
            sign = '-';
            s = s.replaceFirst("-", "");
        }else if(s.startsWith("+")){
            sign = '+';
            s = s.replaceFirst("\\+", "");
        }else {
            sign = '+';
        }

        // Retrieving a string of the number to return
        StringBuilder ans = new StringBuilder();
        boolean atTheBeginning = true;
        for(int i = 0; i<s.length(); i++){
            char character = s.charAt(i);
            if (character == '0' && atTheBeginning) continue;
            atTheBeginning = false;
            if(Character.isDigit(character)) ans.append(character);
            else break;
        }

        String max = String.valueOf(Integer.MAX_VALUE);
        String min = String.valueOf(Integer.MIN_VALUE).replaceFirst("-", "");
        if(ans.length() > max.length() && sign == '+') return Integer.MAX_VALUE;
        else if (ans.length() > min.length() && sign == '-') return Integer.MIN_VALUE;
        else if(ans.length() == max.length()){
            if (sign == '+') {
                for (int i = 0; i < ans.length(); i++) {
                    if (Integer.parseInt(String.valueOf(ans.charAt(i))) < Integer.parseInt(String.valueOf(max.charAt(i)))) break;
                    if (Integer.parseInt(String.valueOf(ans.charAt(i))) == Integer.parseInt(String.valueOf(max.charAt(i)))) continue;
                    return Integer.MAX_VALUE;
                }
            }else{
                for (int i = 0; i < ans.length(); i++) {
                    if (Integer.parseInt(String.valueOf(ans.charAt(i))) < Integer.parseInt(String.valueOf(min.charAt(i)))) break;
                    if (Integer.parseInt(String.valueOf(ans.charAt(i))) == Integer.parseInt(String.valueOf(min.charAt(i)))) continue;
                    return Integer.MIN_VALUE;
                }
            }

        }
        if (ans.length() == 0) return 0;
        if (sign == '-') return Integer.parseInt(sign + ans.toString());
        return Integer.parseInt(ans.toString());
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("1095502006p8"));
    }
}
