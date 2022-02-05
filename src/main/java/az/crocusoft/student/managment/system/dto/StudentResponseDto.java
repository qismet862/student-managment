package az.crocusoft.student.managment.system.dto;

import az.crocusoft.student.managment.system.dao.entity.Student;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentResponseDto {
    Long id;
    String firstName;
    String lastName;
    String email;



    public StudentResponseDto() {
    }

    public StudentResponseDto(Student student1) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
