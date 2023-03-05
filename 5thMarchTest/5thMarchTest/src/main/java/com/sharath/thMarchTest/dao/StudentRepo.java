package com.sharath.thMarchTest.dao;

import com.sharath.thMarchTest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByFirstName(String firstName);

    List<Student> findByAge(Integer age);


    @Query(value = "select * from tbl_student where first_name =:firstName or last_name= :lastName",nativeQuery = true)
    List<Student> findByLastNameOrFirstName(String firstName, String lastName);

    @Query(value = "select * from tbl_student where active=1",nativeQuery = true)
    List<Student> getAll();

    List<Student> findByAgeGreaterThan(Integer age);

    @Query(value = "select * from tbl_student where last_name= :lastName",nativeQuery = true)
    List<Student> findByLastName(String lastName);

}
