package homework_5.service;

import java.util.List;

import homework_5.model.Group;
import homework_5.model.Student;
import homework_5.model.StudyGroup;
import homework_5.model.Teacher;

public class StudyGroupServiceImpl implements GroupService<Teacher, Student> {
    
    @Override
    public Group<Teacher, Student> createGroup() {
        return new StudyGroup();
    }

    @Override
    public Group<Teacher, Student> createGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students, null);
    }

    public StudyGroup createGroup(Teacher teacher, List<Student> students, String numberGroup) {
        return new StudyGroup(teacher, students, numberGroup);
    }

    @Override
    public void addGroupMember(Group<Teacher, Student> group, Student member) {
        ((StudyGroup)group).getStudentList().add(member);
    }

    @Override
    public void delGroupMember(Group<Teacher, Student> group, String id) {
        Student markByDelete = this.getGroupMember(group, id);
        if (markByDelete == null) {
            try {
                throw new Exception("Studen not in group");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            ((StudyGroup)group).getStudentList().remove(markByDelete);
        }
    }

    @Override
    public Student getGroupMember(Group<Teacher, Student> group, String id) {
        for (Student student : ((StudyGroup)group).getStudentList()) {
            if(student.getId().equals(id)) 
                return student;
        }
        return null;
    }

    @Override
    public void setGroupManager(Group<Teacher, Student> group, Teacher manager) {
        ((StudyGroup)group).setTeacher(manager);
    }

   
  
}
