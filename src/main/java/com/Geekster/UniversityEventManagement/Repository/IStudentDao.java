package com.Geekster.UniversityEventManagement.Repository;

import com.Geekster.UniversityEventManagement.models.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends CrudRepository<Students,Integer> {
}
