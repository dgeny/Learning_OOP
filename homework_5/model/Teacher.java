package homework_5.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher extends User{
    protected Set<Subject> subjects;
    
    public Teacher(String name, String lastName, LocalDate dateOfBorn) {
        super(name, lastName, dateOfBorn);
        this.subjects = new HashSet<>();
    }
    
    public void addSubject(Subject subject){
        this.subjects.add(subject);        
    }

    public List<Subject> getAvaibleSubjects(){
        return new ArrayList<>(this.subjects);
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", lastName=" + lastName + ",\n\tsubjects=" + getAvaibleSubjects().toString() + "]";
    }
}
