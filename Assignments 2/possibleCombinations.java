import java.util.Arrays;
import java.util.List;
 
class Main
{
    public static void findCombinations(List<List<Character>> keypad,
                                        int[] input, String res, int index)
    {
        if (index == -1) {
            System.out.print(res + " ");
            return;
        }
 
        int digit = input[index];
 
        for (char c: keypad.get(digit)) {
            findCombinations(keypad, input, c + res, index - 1);
        }
    }
 
    public static void main(String[] args)
    {
        List<List<Character>> keypad = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList( 'A', 'B', 'C' ),
                Arrays.asList( 'D', 'E', 'F' ),
                Arrays.asList( 'G', 'H', 'I' ),
                Arrays.asList( 'J', 'K', 'L' ),
                Arrays.asList( 'M', 'N', 'O' ),
                Arrays.asList( 'P', 'Q', 'R', 'S'),
                Arrays.asList( 'T', 'U', 'V' ),
                Arrays.asList( 'W', 'X', 'Y', 'Z')
        );
 
        int[] input = { 2, 3, 4 };
 
        findCombinations(keypad, input, "", input.length - 1);
} 