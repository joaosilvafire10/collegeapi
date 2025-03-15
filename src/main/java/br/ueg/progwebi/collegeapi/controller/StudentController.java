package br.ueg.progwebi.collegeapi.controller;

import br.ueg.progwebi.collegeapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @GetMapping
    public List<Student> listAll(){
        // Criando o objeto student corretamente
        Student student = new Student();
        student.setId(1L);
        student.setName("João");  // Exemplo de como definir outros atributos
        student.setRegisterNumber("20250544121");
        student.setCourse("SI");
        student.setRegisterDate(LocalDate.now());

        Student student2 = Student.builder().id(2L)
                .name("Student2")
                .registerNumber("0022")
                .course("SI")
                .registerDate(LocalDate.now())
                .build();
        List<Student> students = Arrays.asList(student,student2);
        return students;
    }
}
