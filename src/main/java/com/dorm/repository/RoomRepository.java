package com.dorm.repository;

import com.dorm.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA Repository for Room entity.
 * Provides CRUD operations and custom query methods for Room objects.
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    // Spring Data JPA automatically provides basic CRUD operations:
    // - save(Room room)
    // - findById(Long id)
    // - findAll()
    // - delete(Room room)
    // - deleteById(Long id)
    // - exists(Long id)
    // - count()
    
    // Custom query methods can be added here as needed
}
