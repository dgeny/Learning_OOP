package homework_4;

import java.util.Comparator;

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
