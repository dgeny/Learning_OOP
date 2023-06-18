package homework_1;

import java.util.LinkedList;

/* 
 * 
    1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
    2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
        и реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
        выдающий продукт соответствующий имени, объёму и температуре
    3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
        и воспроизвести логику, заложенную в программе
    4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 *
 */

public class program {
    public static void main(String[] args) {
        LinkedList<Product> l = new LinkedList<>();      
        l.add(new HotWater("Coffee", 50, 80, 1));
        l.add(new HotWater("Tee", 60, 94, 2));
        l.add(new HotWater("Very Hot Water", 50, 100, 20));

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.putProducts(l);

        System.out.println(machine.getProduct());
        System.out.println(machine.getProduct("Coffee", 94, 1) ); // test null printed
        System.out.println(machine.getProduct("Coffee", 80, 1) );
        System.out.println(machine.getProduct("Coffee", 80, 1) );//test 
    }
}
