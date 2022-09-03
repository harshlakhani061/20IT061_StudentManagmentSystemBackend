package com.example.StudentManagmentSystemBackend.Repository;

import com.example.StudentManagmentSystemBackend.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
