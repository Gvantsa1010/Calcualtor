import RomanToInteger.RomanToInteger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static RomanToInteger.RomanToInteger.convertIntegerToRoman;
import static RomanToInteger.RomanToInteger.convertRomanToInteger;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int answer = 0;
        Boolean lastInputIsOperation = true;
        String lasOperationInput = "";
        while (true) {
            String operation = "";
                if (lastInputIsOperation) {
                    System.out.print("Enter the roman number: ");
                    String str1 = input.next();

                    if (str1.equals("IIII") || str1.equals("VIIII") || str1.equals("XXXX") || str1.equals("LXXXX")) {
                        System.out.println("Invalid symbol");
                        continue;
                    }

                    int number = convertRomanToInteger(str1);
                    if(number==-1){
                        System.out.println("Invalid symbol");
                        continue;
                    }

                    if (answer == 0) {
                        answer += number;
                    } else {
                        if (lasOperationInput.equals("+")) {
                            answer += number;
                        }
                        if (lasOperationInput.equals("-")) {
                            answer -= number;
                        }
                        if (lasOperationInput.equals("*")) {
                            answer *= number;
                        }
                        if (lasOperationInput.equals("/")) {
                            answer = answer / number;
                        }

                    }

                    lastInputIsOperation = false;

                    System.out.println();
                } else {
                    System.out.print("Enter the operation: ");
                    operation = input.next().trim();
                    System.out.println();
                    lasOperationInput = operation;
                    if (!lasOperationInput.equals("+") && !lasOperationInput.equals("exit")&&!lasOperationInput.equals("-")&&!lasOperationInput.equals("*")&&!lasOperationInput.equals("/")) {
                        System.out.println("bad operation");
                        continue;
                    }
                    lastInputIsOperation = true;
                    if (operation.equals("exit")) {
                        String ans = convertIntegerToRoman(answer);
                        System.out.println(ans);
                        break;
                    }
                }


        }
    }
}



