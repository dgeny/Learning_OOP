package homework_5.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup extends Group<Teacher, Student> {
    protected String numberGroup;
    
    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }
    
    public StudyGroup(){
        members = new ArrayList<Student>();
    }
    
    public StudyGroup(Teacher teacher, List<Student> students, String numberGroup){
        this.manager = teacher;
        this.members = students;
        this.numberGroup = numberGroup == null ? "undefinedNumber" : numberGroup;
    }

    public List<Student> getStudentList(){
        return this.members;
    }

    public Teacher getTeacher(){
        return this.manager;
    }

    public void setTeacher(Teacher teacher){
        this.manager = teacher;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudyGroup " + this.numberGroup + "[\n");
        sb.append("Teacher: " + this.manager.toString() + "\n");
        sb.append("Student list:\n");
        for (Student student : members) {
            sb.append("\t" + student.toString());
        }
        return sb.toString()+"\n]";
    }
    
}
