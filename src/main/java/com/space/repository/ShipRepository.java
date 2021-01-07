package com.space.repository;


import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository
        extends JpaRepository<Ship, Long>, JpaSpecificationExecutor<Ship> {
    Ship getById(Long id);
}
