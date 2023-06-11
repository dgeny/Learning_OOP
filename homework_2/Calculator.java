package homework_2;

import java.util.LinkedList;

public class Calculator {
    private LinkedList<Operation> supported;
    
    public Calculator(){
        supported = new LinkedList<>();
        supported.add(new Add());
        supported.add(new Sub());
        supported.add(new Mul());
        supported.add(new Div());
    }

    public Object execute(String expression){
        String[] expr_parts = CalculatorParser.parseOperands(expression);
        if(expr_parts.length == 3){
            if(!(checkOperand(expr_parts[0]) && checkOperand(expr_parts[2])))
                return null;
            for (Operation op : supported) {
                if(op.isThisOperation(expr_parts[1])){
                    op.setOperand1(Double.parseDouble(expr_parts[0]));
                    op.setOperand2(Double.parseDouble(expr_parts[2]));
                    return op.executeOperation();
                }
            }
            return null;
        }
        else { return null; }
    }


    /**
     * Проверка операнда на число
     * @param operand проверяемое строковое значение
     */
    private boolean checkOperand(String operand){
        try {
            Double.parseDouble(operand);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
     
}
