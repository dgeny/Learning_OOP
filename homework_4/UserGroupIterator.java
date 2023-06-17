package homework_4;

import java.util.Iterator;
import java.util.List;

public class UserGroupIterator<T extends User> implements Iterator<T>{

    private int currentIndex;
    private List<T> list;

    public UserGroupIterator (List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < this.list.size();
    }

    @Override
    public T next() {
        if(hasNext()){
            return this.list.get(currentIndex++);
        }
        throw new RuntimeException("Teachers out of range");
    }

}
