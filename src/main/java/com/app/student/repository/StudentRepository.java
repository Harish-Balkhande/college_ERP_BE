package com.app.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.student.entity.StudentPersonalDetails;

public interface StudentRepository extends JpaRepository<StudentPersonalDetails, Long> {

}
