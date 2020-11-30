package interview;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Random;

public class RadomNumberOperations {

        public static void main(String[] args) throws ScriptException {
            char[] operators= new char[]{'+', '-', '*'};
            combinations(3, operators, "");
        }

        public static void combinations(int maxLength, char[] alphabet, String curr) throws ScriptException {
            // If the current string has reached it's maximum length
            if (curr.length() == maxLength) {
                System.out.println(curr);
                calculate(curr);

                // Else add each letter from the alphabet to new strings and process these new strings again
            } else {
                for (int i = 0; i < alphabet.length; i++) {
                    String oldCurr = curr;
                    curr += alphabet[i];
                    combinations(maxLength, alphabet, curr);
                    curr = oldCurr;
                }
            }
        }

        private static void calculate(String operators) throws ScriptException {
            int operand1, operand2, operand3, operand4;
            Random randGen = new Random();
           // Scanner scanner =  new Scanner( System.in );
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            int result = 0;
            String operation = ""; // this will hold all the operands and operators
            while (result != 16) {
                operand1 = randGen.nextInt(101);
                operand2 = randGen.nextInt(101);
                operand3 = randGen.nextInt(101);
                operand4 = randGen.nextInt(101);
	           /* operand1 =1;
	            operand2 = 3;
	            operand3 = 4;
	            operand4 = 5;*/
	            /*So here is where it got a bit tricky and you can go different ways about this.
	             I went the easy way and used the built-in Javascript engine.*/
                operation = String.valueOf(operand1) + operators.charAt(0) + String.valueOf(operand2) + operators.charAt(1) + String.valueOf(operand3) + operators.charAt(2) + String.valueOf(operand4);
                // System.out.println(operation);
                result = (int) Double.parseDouble(engine.eval(operation).toString());
            }
            System.out.println(operation + "= 16");
        }
}
