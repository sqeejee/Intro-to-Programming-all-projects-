import java.util.*;
public class Main {

    public static void main(String[] args) {
        String equation;
        Scanner kb = new Scanner (System.in);
        System.out.println ("Penis lol ");
        equation = kb.next ();
        int result = compute(equation);
        System.out.println(result);
    }

    static int compute(String equation) {
        int result = 0;
        String []byPluses = equation.split("\\+");
        for (String multipl : byPluses) {
            String []byMultipl = multipl.split("\\*");
            int multiplResult = 1;
            for (String operand : byMultipl) {
                multiplResult *= Integer.parseInt(operand);
            }
            result += multiplResult;
        }
        return result;
    }

}