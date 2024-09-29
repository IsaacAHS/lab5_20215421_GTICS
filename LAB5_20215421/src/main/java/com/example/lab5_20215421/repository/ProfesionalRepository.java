package com.example.lab5_20215421.repository;

import com.example.lab5_20215421.entity.Profesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional, Integer>{
    @Query(value = "SELECT p.* " +
            "FROM profesionales p " +
            "JOIN sede s ON p.idSede= a.idSedes " +
            "JOIN area a ON p.idSede= s.idAreas" +
            //"WHERE p.nombre LIKE %:nombre% " +
            "AND a.nombreArea = :area " +
            "AND s.nombreSede = :sede ",
            nativeQuery = true)
    List<Profesional> buscarProfesionalConFiltros(String area, String sede);

}
