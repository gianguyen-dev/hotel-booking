package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Momo;

@Repository
public interface MomoRepository extends JpaRepository<Momo, Long>{

}
