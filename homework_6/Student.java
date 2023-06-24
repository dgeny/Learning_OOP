package homework_6;


import java.time.LocalDate;

public class Student extends User{
    //не рефакторим, т.к. id пользователя может быть не нужно для родительского класса
    //т.е фактически не реализуем ненужного поведения
    private Long studentId;
    
    public Student(long studentId,String firstName, String secondName,
                   String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }
    
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }
}
