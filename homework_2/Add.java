package homework_2;

/** 
 * Класс, реализующий операцию сложения
 *  **/
public class Add extends Operation {
    public Add(){
        super();
        this.stringValue = "+";
    }
    public Double executeOperation() {
        return operand1 + operand2;
    }   

}
