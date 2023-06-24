package homework_5.model;

import java.time.LocalDate;
import java.util.UUID;

public abstract class User {
    protected String name;
    protected String lastName;
    protected LocalDate dateOfBirth;
    protected String id;

    public User(String name, String lastName, LocalDate dateOfBorn){
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBorn;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + "]";
    }
    
   
}
