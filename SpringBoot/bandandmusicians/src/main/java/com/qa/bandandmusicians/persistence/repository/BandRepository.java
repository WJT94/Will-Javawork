package com.qa.bandandmusicians.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.bandandmusicians.persistence.domain.Band;

@Repository
public interface BandRepository extends JpaRepository<Band, Integer>{
    
}
