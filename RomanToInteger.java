package RomanToInteger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {
    public static int convertRomanToInteger(String str){
            if(str == null || str.length() == 0){
                return 0;
            }
            Map<Character, Integer> charMap = new HashMap<>();
            charMap.put('I', 1);
            charMap.put('V', 5);
            charMap.put('X', 10);
            charMap.put('L', 50);
            charMap.put('C', 100);

            int result = 0;
            for(int i=0; i < str.length(); i++){
                if(charMap.get(str.charAt(i))!=null) {
                    if (i != str.length() - 1)
                    {
                        if (charMap.get(str.charAt(i)) >= charMap.get(str.charAt(i + 1))) {
                            result = result + charMap.get(str.charAt(i));
                        } else {
                            result = result - charMap.get(str.charAt(i));
                        }
                   }
                    else
                    {
                        result = result + charMap.get(str.charAt(i));
                    }
                }else {
                    return -1;
                }
            }
            return result;

        }
        public static String convertIntegerToRoman(int num){

            Map<String, Integer> map = new LinkedHashMap<>();
            map.put("C", 100);
            map.put("XC", 90);
            map.put("L", 50);
            map.put("XL", 40);
            map.put("X", 10);
            map.put("IX", 9);
            map.put("V", 5);
            map.put("IV", 4);
            map.put("I", 1);
            StringBuilder sb = new StringBuilder();
            for(Map.Entry<String, Integer> entry: map.entrySet()){
                while(num >= entry.getValue()){
                    num = num - entry.getValue();
                    sb.append(entry.getKey());
                }
            }
            return sb.toString();
        }

    }

