package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        this.estudiantes.remove(estudiante);
        this.estudiantes.add(estudiante);
        System.out.println(estudiante);
        return "redirect:/listarEstudiantes";
    }

    @GetMapping("/listarEstudiantes")
    public String listarEstudiantes(Model model){
        model.addAttribute("lista", estudiantes);
        return "estudiantes-list";
    }

    @GetMapping("/borrarEstudiante")
    public String removerContacto(String matricula){
        Estudiante estudianteEliminar = null;
        for (Estudiante est : this.estudiantes){
            if (est.getMatricula().equals(matricula)){
                estudianteEliminar = est;
            }
        }
        if (estudianteEliminar != null){
            this.estudiantes.remove(estudianteEliminar);
        }
        return "redirect:/listarEstudiantes";
    }

    @GetMapping("/editarEstudiante")
    public String editarEstudiante(String matricula, Model model){
        Estudiante estudianteEditar = null;
        for (Estudiante est : this.estudiantes){
            if (est.getMatricula().equals(matricula)){
                estudianteEditar = est;
            }
        }
        model.addAttribute("estudiante", estudianteEditar);
        return "estudiantes-form";
    }

}
