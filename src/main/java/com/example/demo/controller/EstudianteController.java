package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EstudianteController {

    public List<Estudiante> estudiantes = new ArrayList<>();

    @GetMapping("/crearEstudiante")
    public String exibirForm(Estudiante estudiante){
        return "estudiantes-form";
    }

    @PostMapping("/guardarEstudiante")
    public String salvarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
        System.out.println(estudiante);
        return "redirect:/crearEstudiante";
    }

}
