package com.qa.bandandmusicians.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.bandandmusicians.persistence.domain.Musician;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, Integer>{
    
}