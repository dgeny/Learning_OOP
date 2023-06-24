package homework_6;

import java.util.List;

//оригинал: public class StudentGroup implements Iterable<Student>{
/*  Закомментировал повторяемую имплементацию методов
    
    a) единственная ответственность - этот класс отвечает только за реализацию UserGroup для конкретного типа Student
    б) открытость/закрытость - нужен расширенный функционал(например, староста или прочее которые доступны для преподавания) -.
    в) принцип возможности использования базового типа вместо дочернего - в классе Program используется итерирование foreach 
    реализованное в родительском классе
    г) не реализует интерфейсы, которые не использует
    д) базовый класс не зависит от конкретной реализации этого класса.
 */ 
public class StudentGroup extends UserGroup<Student>{
    //private List<Student> students; - пользуемся родительским списком
    private Teacher teacher;

    public StudentGroup(List<Student> students) {
        super(students);
    }
    /* public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    } */

    
    @Override
    public String toString() {
        return "StudentGroup{" +
               //"students=" + students + // берем родительский список
               "students=" + super.getUsers() +
               ", teacher=" + teacher +
               '}';
    }
/* 
    @Override
    public UserGroupIterator<Student> iterator() {
        return new UserGroupIterator<Student>(this.students);
    } */
}
