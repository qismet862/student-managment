package az.crocusoft.student.managment.system.dao.repo;

import az.crocusoft.student.managment.system.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
