package com.example.APiRentalMobil.repository;

import com.example.APiRentalMobil.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long>{
    
}
