package homework_5.model;

import java.util.List;

public abstract class Group<T1 extends User, T2 extends User> {
    protected T1 manager;
    protected List<T2> members;
}
