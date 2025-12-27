package com.dorm.repository;

import com.dorm.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository interface for Payment entity.
 * Provides CRUD operations and custom query methods for Payment data access.
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    /**
     * Find all payments for a specific student by their student ID.
     *
     * @param studentId the ID of the student
     * @return a list of payments associated with the student
     */
    List<Payment> findByStudentId(Long studentId);

    /**
     * Find all payments with a specific status.
     *
     * @param status the payment status (e.g., PENDING, COMPLETED, FAILED)
     * @return a list of payments with the specified status
     */
    List<Payment> findByStatus(String status);

    /**
     * Find all payments for a specific student with a specific status.
     *
     * @param studentId the ID of the student
     * @param status the payment status
     * @return a list of payments for the student with the specified status
     */
    List<Payment> findByStudentIdAndStatus(Long studentId, String status);
}
