package homework_6;

import java.util.Comparator;


/* 
    Ничего не рефакторим, т.к. соблюдены:
    a) единственная ответственность - этот класс отвечает только за сравнение объектов типа User
    б) открытость/закрытость - если надо сравнить по другим критериям -> создаем наследника/имплементируем другой класс
    в) принцип возможности использования базового типа вместо дочернего - добавлен код в классе Program
    г) не реализует интерфейсы, которые не использует
    д) базовый класс не зависит от конкретной реализации этого класса.
*/  
public class UserComparator<T extends User> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        int retVal = o1.getSecondName().compareTo(o2.getSecondName());
        if(retVal != 0) return retVal;
        retVal = o1.getFirstName().compareTo(o2.getFirstName());
        if(retVal != 0) return retVal;
        retVal = o1.getPatronymic().compareTo(o2.getPatronymic());
        if(retVal == 0) return retVal;
        retVal = o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        return retVal;
    }
    
}
