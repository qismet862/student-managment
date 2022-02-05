package az.crocusoft.student.managment.system.controller;

import az.crocusoft.student.managment.system.dao.entity.Student;
import az.crocusoft.student.managment.system.dto.StudentRequestDto;
import az.crocusoft.student.managment.system.dto.StudentResponseDto;
import az.crocusoft.student.managment.system.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        model.addAttribute("student",new Student());
        return "create_student";
    }

    @PostMapping("/save/student")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/student/edit/{id}")
    public  String editStudent(@PathVariable Long id,Model model){
        Student student=studentService.findStudentById(id);
        model.addAttribute("student",student);
        return "edit_student";
    }
    @PostMapping("/edit/student/{id}")
    public String editStudents(@PathVariable Long id, @ModelAttribute("student") Student student){
        studentService.editStudent(id,student);
        return "redirect:/students";
    }
    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
