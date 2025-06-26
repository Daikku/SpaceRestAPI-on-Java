package com.example.space_rest_api.repository;

import com.example.space_rest_api.entity.ApodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;



@Repository
public interface ApodRepository extends JpaRepository<ApodEntity, Long>{
    Optional<ApodEntity> findByDate(LocalDate date);
}