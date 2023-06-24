package homework_6;

import java.util.Iterator;
import java.util.List;


/* 
    Ничего не рефакторим, т.к. соблюдены:
    a) единственная ответственность - этот класс отвечает только за итерирование
    б) открытость/закрытость - если надо итерироваться в обратном порядке -> создаем наследника и перегружаем next/hasNext
    в) принцип возможности использования базового типа вместо дочернего - в классе Program используется родительский класс Iterator
    г) не реализует интерфейсы, которые не использует
    д) базовый класс не зависит от конкретной реализации этого класса.
*/  
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
