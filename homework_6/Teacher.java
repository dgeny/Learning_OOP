package homework_6;

import java.time.LocalDate;


public class Teacher extends User {
    //не рефакторим, т.к. id пользователя может быть не нужно для родительского класса
    //т.е фактически не реализуем ненужного поведения
    private Long teacherId;

    public Teacher(long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + teacherId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" +  super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}