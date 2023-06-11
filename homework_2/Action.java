package homework_2;


/** 
 * Интерфейс для операций калькулятора
 **/
public interface Action {
    boolean isThisOperation(String value);
    Object executeOperation();
}
