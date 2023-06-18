package homework_1;

import java.util.LinkedList;

public class HotDrinkVendingMachine implements WaterVendingMachine, VendingMachine{
    LinkedList<Product> listOfProducts;

    public HotDrinkVendingMachine() {
        listOfProducts = new LinkedList<>();
    }

    public void putProducts(LinkedList<Product> items) {
        this.listOfProducts = items;
        
    }
    
    @Override
    public Product getProduct() {        
        return this.listOfProducts.pollLast();
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
    public Product getProduct(String name, int volume) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }



   
    
    
}
