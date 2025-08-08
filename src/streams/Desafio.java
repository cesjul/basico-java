package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> intToBinaryString = i -> Integer.toBinaryString(i);
        UnaryOperator<String> reverseString = s -> {
            String reverse = "";
            for (int i = s.length() - 1; i >=0; i--){
                reverse += s.charAt(i);
            }
            return reverse;
        };
        Function<String, Integer> binaryStringToInt = s -> {
            int result = 0;
            for (int i = 0; i < s.length(); i++){
              int tempInt = Integer.parseInt(Character.toString(s.charAt(i)));
              int base10 = tempInt * (int) Math.pow(2.0, ((s.length()-1) - i));
              result += base10;
            }
            return result;
        };
        

        nums.stream().map(intToBinaryString).map(reverseString).map(binaryStringToInt).forEach(System.out::println);

        
    }
}
