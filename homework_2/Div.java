package homework_2;

/** 
 * Класс, реализующий операцию деления
 * При делении на 0 возвращает null
 *  **/
public class Div extends Operation {
    public Div(){
        super();
        stringValue = "/";
    }

    @Override
    public Object executeOperation() {
        if(operand2 != 0)
            return operand1/operand2;
        else
            return null;
    }
    
}