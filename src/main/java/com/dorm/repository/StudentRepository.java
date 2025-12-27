package com.dorm.repository;

import com.dorm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for Student entity.
 * Provides basic CRUD operations and custom query methods for Student entities.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
