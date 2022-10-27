import RomanToInteger.RomanToInteger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static RomanToInteger.RomanToInteger.convertIntegerToRoman;
import static RomanToInteger.RomanToInteger.convertRomanToInteger;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Roman number: ");
        String str = input.next();
        int result1 = convertRomanToInteger(str);
        System.out.println(result1);

        System.out.println("Enter the second Roman number: ");
        String str2 = input.next();
        int result2 = convertRomanToInteger(str2);
        System.out.println(result2);

        Scanner op = new Scanner(System.in);
        System.out.println("Enter the operation: ");
        String operation = op.next();

        if(operation.equals("+"))
        {
            int sum = result1 + result2;
            String result = convertIntegerToRoman(sum);
            System.out.println("your answer is: " + result);
        }
        if(operation.equals("-"))
        {
            int sum = result1 - result2;
            String result = convertIntegerToRoman(sum);
            System.out.println("your answer is: " + result);
        }
        if(operation.equals("/"))
        {
            int sum = result1 / result2;
            String result = convertIntegerToRoman(sum);
            System.out.println("your answer is: " + result);
        }
        if(operation.equals("*"))
        {
            int sum = result1 * result2;
            String result = convertIntegerToRoman(sum);
            System.out.println("your answer is: " + result);
        }

    }


    }
