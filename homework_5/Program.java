package homework_5;

import java.util.List;

import homework_5.controller.Controller;
import homework_5.model.Student;
import homework_5.model.StudyGroup;
import homework_5.model.Subject;
import homework_5.model.Teacher;


public class Program {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        
        StudyGroup group21 = controller.createGroup("123");
        group21.setNumberGroup("21");
        
        Teacher tc = controller.addTeacher("Мария", "Историчная", "1980-01-01");
        tc.addSubject(Subject.HISTORY);
        controller.addStudent("Алексей", "Алексеев", "2000-01-01");
        controller.addStudent("Иван", "Иванов", "2000-02-01");
        controller.addStudent("Сергей", "Сергеев", "2000-03-01");
        controller.addStudent("Петр", "Петров", "2000-03-01");
        controller.addStudent("Юрий", "Юрьев", "2000-03-01");
        
        
        System.out.println(controller.readGroup());
        List<Student> students = controller.readGroup().getStudentList();
        System.out.println(controller.getStudentById(students.get(0).getId()));
        System.out.println("исключаем студента");
        controller.removeStudentById(students.get(0).getId());
        
        System.out.println(controller.readGroup());

    }
}