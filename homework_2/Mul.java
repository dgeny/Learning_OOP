package homework_2;


/** 
 * Класс, реализующий операцию умножения
 *  **/
public class Mul extends Operation {
    public Mul(){
        super();
        stringValue = "*";
    }

    @Override
    public Object executeOperation() {
        return operand1*operand2;
    }
    
}
