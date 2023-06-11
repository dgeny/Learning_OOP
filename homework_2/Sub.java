package homework_2;


/** 
 * Класс, реализующий операцию вычитания
 *  **/
public class Sub extends Operation {
    public Sub(){
        super();
        this.stringValue = "-";
    }
    @Override
    public Object executeOperation() {
        return operand1-operand2;
    }
    
}
