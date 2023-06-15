package homework_3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class HotDrinkVendingMachine implements WaterVendingMachine, Iterable<Product>{
    LinkedList<Product> listOfProducts;

    public HotDrinkVendingMachine() {
        listOfProducts = new LinkedList<>();
    }

    public void putProducts(LinkedList<Product> items) {
        this.listOfProducts = items;        
    }
    
    @Override
    public Product getProduct() {
        return this.listOfProducts.peekFirst();
    }

    @Override
    public Product getProduct(String name, int volume) {
        for (Product product : listOfProducts) {
            if (product.name.equals(name) && ((Water)product).volume == volume) {
                return product;
            }           
        }
        return null;
    }

    public Product getProduct(String name, int temperature, int volume) {
        for (Product el : listOfProducts) {
            if( 
                el.getName().equals(name) && ((HotWater)el).getTemperature() == temperature && 
                ((HotWater)el).getVolume() == volume)
                    return el;
        }
        return null;
    }
    
    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(this.listOfProducts);
    }

    public void sortByPrice() {
        Collections.sort(listOfProducts);
    }
}
