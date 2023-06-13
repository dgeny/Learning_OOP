package homework_3;

import java.util.LinkedList;

public interface VendingMachine {
    public void putProducts(LinkedList<Product> items);
    public Product getProduct(); 
}
