package com.rishabh.Lab.Repository;

import com.rishabh.Lab.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
