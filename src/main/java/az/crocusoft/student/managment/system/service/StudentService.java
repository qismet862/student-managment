package az.crocusoft.student.managment.system.service;

import az.crocusoft.student.managment.system.dao.entity.Student;
import az.crocusoft.student.managment.system.dto.StudentRequestDto;
import az.crocusoft.student.managment.system.dto.StudentResponseDto;

import java.util.List;

public interface StudentService {
    List<StudentResponseDto> getAllStudents();
    Student saveStudent(Student Student);
    Student findStudentById(Long id);
    Student editStudent(Long id,Student student);
    void deleteStudentById(Long id);
}
