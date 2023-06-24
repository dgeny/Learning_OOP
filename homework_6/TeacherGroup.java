package homework_6;

import java.util.List;

// оригинал: public class TeacherGroup implements Iterable<Teacher>{
/* 
 * Закомментировал повторяемую имплементацию методов
    
    a) единственная ответственность - этот класс отвечает только за реализацию UserGroup для конкретного типа Teacher
    б) открытость/закрытость - нужен расширенный функционал(например, список предметов, которые доступны для преподавания).
    в) принцип возможности использования базового типа вместо дочернего - в классе Program используется итерирование foreach 
    реализованное в родительском классе
    г) не реализует интерфейсы, которые не использует
    д) базовый класс не зависит от конкретной реализации этого класса.
 
 */
public class TeacherGroup extends UserGroup<Teacher> {
    /*
    
    private List<Teacher> teachers; 
    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    } */

    public TeacherGroup(List<Teacher> users) {
        super(users);
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + super.getUsers() +
                '}';
    }

   /*  @Override
    public UserGroupIterator<Teacher> iterator() {
        return new UserGroupIterator<Teacher> (this.teachers);
    } */
}
