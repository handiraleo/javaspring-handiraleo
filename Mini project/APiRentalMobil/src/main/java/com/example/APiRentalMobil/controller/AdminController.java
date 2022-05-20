package com.example.APiRentalMobil.controller;

import java.util.List;
import java.util.Optional;

import com.example.APiRentalMobil.entity.Admin;
import com.example.APiRentalMobil.repository.AdminRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    private AdminRepo adminRepo;

    @GetMapping("/admin")
    public List<Admin> getAllAdmin() {
        return adminRepo.findAll();
    }

    @GetMapping("/admin/{id}")
    public Optional<Admin> getDetailAdmin(@PathVariable Long id) {
        return adminRepo.findById(id);
    }

    @PostMapping("/admin")
    public Admin createNewAdmin(@RequestBody Admin payload) {
        return adminRepo.save(payload);
    }

    @PutMapping("/admin/{id)")
    public Optional<Admin> updateAdmin(
        @PathVariable Long id,
        @RequestBody Admin admin ) {
            Optional<Admin> adminById = adminRepo.findById(id);

            adminById.ifPresent(res ->{
                res.setNama(admin.getNama());
                res.setUsername(admin.getUsername());
                res.setPassword(admin.getPassword());

                adminRepo.save(res);
            });

            return adminById;
        }
        
    
}
