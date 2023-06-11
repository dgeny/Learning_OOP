package homework_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorParser {

    /**
     * Простой парсер выражения на оператор и операнды. Поддерживает операнды с 
     * плавающей точкой. 
     * @param input входная строка
     * @return массив строк из 3 элементов [первый операнд, оператор, второй операнд]
     */
    public static String[] parseOperands(String input){
        Pattern ptrn = Pattern.compile(
                "(?<f>-?\\d*\\.{0,1}\\d+)(?<op>[+-/*])(?<s>-?\\d*\\.{0,1}\\d+)");
        Matcher mtch = ptrn.matcher(input);
        if(mtch.matches()){
            return new String[] {
                mtch.group("f"),
                mtch.group("op"),
                mtch.group("s")
            };
        }
        else{
            return new String[0];
        }
    }

    
}
