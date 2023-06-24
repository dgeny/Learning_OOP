 package homework_5.model;

import java.time.LocalDate;

public class Student extends User{
    protected int yearOfAdmission;
    
    public Student(String name, String lastName, LocalDate dateOfBorn, int yearOfAdmission) {
        super(name, lastName, dateOfBorn);
        this.yearOfAdmission = yearOfAdmission;
    }
    
    public Student(String name, String lastName, LocalDate dateOfBorn) {
        super(name, lastName, dateOfBorn);
        this.yearOfAdmission = LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", lastName=" + lastName + ", yearOfAdmission=" + yearOfAdmission + "]";
    }

    
    
}
