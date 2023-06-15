package homework_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductIterator implements Iterator<Product> {
    private int counter;
    private List<Product> list;

    public ProductIterator (LinkedList<Product> list) {
        this.counter = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return counter < list.size();
    }

    @Override
    public Product next() {
        if (hasNext()) {
            return list.get(counter++);
        }
        else
        {
            return null;
        }
    }

    
    
}
