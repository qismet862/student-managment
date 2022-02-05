package az.crocusoft.student.managment.system.service.impl;

import az.crocusoft.student.managment.system.dao.entity.Student;
import az.crocusoft.student.managment.system.dao.repo.StudentRepository;
import az.crocusoft.student.managment.system.dto.StudentRequestDto;
import az.crocusoft.student.managment.system.dto.StudentResponseDto;
import az.crocusoft.student.managment.system.mapper.StudentMapper;
import az.crocusoft.student.managment.system.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;


    @Override
    public List<StudentResponseDto> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        List<StudentResponseDto> studentResponseDtoList = studentMapper.getAllStudents(studentList);
        return studentResponseDtoList;
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return  student.get();
    }

    @Override
    public Student editStudent(Long id,Student student) {
        Student studentDB=findStudentById(id);
        studentDB.setId(student.getId());
        studentDB.setFirstName(student.getFirstName());
        studentDB.setLastName(student.getLastName());
        studentDB.setEmail(student.getEmail());
        return studentRepository.save(studentDB);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
