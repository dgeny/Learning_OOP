package homework_5.controller;


import java.time.LocalDate;
import java.util.List;

import homework_5.model.Student;
import homework_5.model.StudyGroup;
import homework_5.model.Teacher;
import homework_5.service.StudyGroupServiceImpl;

public class Controller {
    StudyGroup group;
    StudyGroupServiceImpl service;

    public Controller(){
        service = new StudyGroupServiceImpl();
    }

    public StudyGroup createGroup(String numberOfGroup) {
        group = (StudyGroup)service.createGroup();
        group.setNumberGroup(numberOfGroup);
        return group;
    }


    public List<Student> getStudents() {
        return group.getStudentList();
    }


    public Student getStudentById(String id) throws Exception {
        Student returned = null;
        for (Student student : group.getStudentList()) {
            if(student.getId().equals(id)){
                returned = student;
            }
        }
        if(returned == null){
            throw new Exception("Student not found");
        }
        return returned;
    }


    public void removeStudentById(String id) {
        service.delGroupMember(group, id);
    }


    public StudyGroup readGroup() {
        return group;
    }

    public Teacher addTeacher(String name, String lastName, String dateOfBorn) {
        Teacher teacher = new Teacher(name, lastName, LocalDate.parse(dateOfBorn));
        service.setGroupManager(group, teacher);
        return group.getTeacher();
    }

    public Student addStudent(String name, String lastName, String dateOfBorn) {
        Student student = new Student(name, lastName, LocalDate.parse(dateOfBorn));
        service.addGroupMember(group, student);
        return student;
    }
}
