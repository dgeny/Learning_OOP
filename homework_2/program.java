package homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Реализовать калькулятор в ООП стиле */

public class program {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String str="";
        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("введите выражение для вычисления или 'q' для выхода: ");  
                str = br.readLine();
                if (str.charAt(0) == 'q')
                {
                    br.close();
                    return;
                }
                Object result = calc.execute(str);
                if (result == null)
                {
                    System.out.println("Введено некорректное выражение");
                }
                else{
                    if(result.toString().matches(".*\\.0")){
                        System.out.println(((Double)result).intValue());
                    }
                    else{
                        System.out.println(result);
                    }
                }                
            } while (true);
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
            return;
        }
    }
}
