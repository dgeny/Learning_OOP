package homework_6;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


/*
    Мой исходник семинара: https://github.com/dgeny/Learning_OOP/tree/master/homework_4,
    эталонного приложено к записи не было.

    Задача: 
    Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
    Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему. 
*/
public class Program {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "Ivan", "Ivanov", "!?", LocalDate.now()));
        teachers.add(new Teacher(3, "Petr", "Petrov", "!?", LocalDate.now()));
        teachers.add(new Teacher(2, "Vasilij", "Vasiliev", "!?", LocalDate.now()));
        teachers.add(new Teacher(4, "Isaak", "Newton", "!?", LocalDate.now()));

        System.out.println("teachers");
        System.out.println(teachers + "\n");

        //Добавлено для демонстрации принципа подстановки Liskov
        // в оригинале teachers.sort(new UserComparator<>());
        Comparator cmp = new UserComparator<>(); 
        teachers.sort(cmp);
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