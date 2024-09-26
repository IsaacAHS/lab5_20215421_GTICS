package com.example.lab5_20215421.repository;

import com.example.lab5_20215421.entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SedeRepository extends JpaRepository<Sede,Integer>{
}
