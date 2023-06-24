package homework_5.service;

import java.util.List;

import homework_5.model.Group;
import homework_5.model.User;

public interface GroupService<T1 extends User, T2 extends User> {
    abstract Group<T1, T2> createGroup();
    abstract Group<T1, T2> createGroup(T1 manager, List<T2> members);
    abstract void addGroupMember(Group<T1,T2> group, T2 member);
    abstract void delGroupMember(Group<T1,T2> group, String id);
    abstract T2 getGroupMember(Group<T1,T2> group, String id);
    abstract void setGroupManager(Group<T1,T2> group, T1 manager);
}
