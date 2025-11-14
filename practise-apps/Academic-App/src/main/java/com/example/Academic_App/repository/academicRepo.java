package com.example.Academic_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Academic_App.model.Academic;

@Repository
public interface academicRepo extends JpaRepository<Academic,Integer> {

}
