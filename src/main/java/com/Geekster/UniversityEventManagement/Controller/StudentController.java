package com.Geekster.UniversityEventManagement.Controller;

import com.Geekster.UniversityEventManagement.Service.StudentService;
import com.Geekster.UniversityEventManagement.models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/students")
    public Iterable<Students> getStudent(){
      return  studentService.getAllStudents();
    }
    @PostMapping(value = "/addStudent")
    public String insertStudent(@RequestBody List <Students> studentsList){
       return studentService.addStudent(studentsList);
    }
    @DeleteMapping(value="/deleteStudent/{id}")
    public void DeleteStudentById(@PathVariable Integer id){
        studentService.removeStudentById(id);
    }


}
