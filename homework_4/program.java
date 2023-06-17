package homework_4;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class program {
    public static void main(String[] args) {

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "Ivan", "Ivanov", "!?", LocalDate.now()));
        teachers.add(new Teacher(3, "Petr", "Petrov", "!?", LocalDate.now()));
        teachers.add(new Teacher(2, "Vasilij", "Vasiliev", "!?", LocalDate.now()));
        teachers.add(new Teacher(4, "Isaak", "Newton", "!?", LocalDate.now()));

        System.out.println("teachers");
        System.out.println(teachers + "\n");

        teachers.sort(new UserComparator<>());
        System.out.println("Sorted list:");
        System.out.println(teachers + "\n");

        System.out.println("Iterator:");
        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println();
        System.out.println("TeacherGroup iterator");
        TeacherGroup teacherGroup = new TeacherGroup((List<Teacher>)teachers);
        for (Teacher teacher : teacherGroup) {
            System.out.println(teacher);
        }
    }
}