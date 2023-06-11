package homework_2;

/**  
 * Абстрактный класс, описывающий общие свойства и методы вычисления выражений
 * Имплементирует метод {@code isThisOperation} интерфейса {@code Action}
 * **/
public abstract class Operation implements Action {
    protected String stringValue;
    protected Double operand1;
    protected Double operand2;
    public void setOperand1(Double value){
        this.operand1 = value;
    }
    public void setOperand2(Double value){
        this.operand2 = value;
    }

    @Override
    public boolean isThisOperation(String value){
        return this.stringValue.equals(value);
    }
}
