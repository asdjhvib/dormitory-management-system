package com.dorm.repository;

import com.dorm.entity.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA Repository for CheckIn entity.
 * Provides CRUD operations and custom query methods for CheckIn records.
 */
@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Long> {

    /**
     * Find all check-in records for a specific resident.
     *
     * @param residentId the ID of the resident
     * @return a list of CheckIn records for the resident
     */
    List<CheckIn> findByResidentId(Long residentId);

    /**
     * Find all check-in records for a specific room.
     *
     * @param roomId the ID of the room
     * @return a list of CheckIn records for the room
     */
    List<CheckIn> findByRoomId(Long roomId);

    /**
     * Find a check-in record by resident ID and check-in ID.
     *
     * @param residentId the ID of the resident
     * @param checkInId the ID of the check-in record
     * @return an Optional containing the CheckIn record if found
     */
    Optional<CheckIn> findByIdAndResidentId(Long checkInId, Long residentId);

}
