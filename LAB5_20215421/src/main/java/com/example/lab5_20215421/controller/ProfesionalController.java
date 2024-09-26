package com.example.lab5_20215421.controller;

import com.example.lab5_20215421.entity.Profesional;
import com.example.lab5_20215421.repository.ProfesionalRepository;
import com.example.lab5_20215421.repository.AreaRepository;
import com.example.lab5_20215421.repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Optional;
@Controller
@RequestMapping("/profesionales")
public class ProfesionalController {
    final SedeRepository sedeRepository;
    final AreaRepository areaRepository;
    final ProfesionalRepository profesionalRepository;

    public ProfesionalController(SedeRepository sedeRepository,
                             AreaRepository areaRepository,
                             ProfesionalRepository profesionalRepository) {
        this.sedeRepository = sedeRepository;
        this.areaRepository = areaRepository;
        this.profesionalRepository = profesionalRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaProductos(Model model) {
        model.addAttribute("listaProfesionales", profesionalRepository.findAll());
        return "product/list";
    }






}
