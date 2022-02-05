package az.crocusoft.student.managment.system.mapper;

import az.crocusoft.student.managment.system.dao.entity.Student;
import az.crocusoft.student.managment.system.dto.StudentRequestDto;
import az.crocusoft.student.managment.system.dto.StudentResponseDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface StudentMapper {
    List<StudentResponseDto> getAllStudents(List<Student> studentList);

}
