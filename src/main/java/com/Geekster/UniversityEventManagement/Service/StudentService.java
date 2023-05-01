package com.Geekster.UniversityEventManagement.Service;

import com.Geekster.UniversityEventManagement.Repository.IStudentDao;
import com.Geekster.UniversityEventManagement.models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentDao studentDao;

    public Iterable<Students> getAllStudents() {
       Iterable<Students> allStudents = studentDao.findAll();
       return allStudents;
    }

    public String addStudent(List<Students>studentsList) {
      Iterable<Students> savedAllStudent = studentDao.saveAll(studentsList);
      if(savedAllStudent != null){
          return "Yes";
      }else{
          return "Not Added";
      }
    }

    public void removeStudentById(Integer id) {
     studentDao.deleteAllById(Collections.singleton(id));
    }
}

