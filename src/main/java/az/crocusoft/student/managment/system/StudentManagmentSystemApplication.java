package az.crocusoft.student.managment.system;

import az.crocusoft.student.managment.system.dao.entity.Student;
import az.crocusoft.student.managment.system.dao.repo.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentManagmentSystemApplication implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentManagmentSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        studentRepository.save(Student.builder()
//                        .firstName("qismet")
//                        .lastName("qedirli")
//                        .email("qismet@gmail.com")
//                .build());
//        studentRepository.save(Student.builder()
//                .firstName("orxan")
//                .lastName("mikayilov")
//                .email("orxan@gmail.com")
//                .build());
//        studentRepository.save(Student.builder()
//                .firstName("nergiz")
//                .lastName("ibadova")
//                .email("nergiz@gmail.com")
//                .build());
    }
}
