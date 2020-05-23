package com.example.demo.model;

public class Estudiante {

    private String matricula;
    private String nombre;
    private String telefono;

    public Estudiante() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estudiante other = (Estudiante) obj;
        if (matricula == null){
            if (other.matricula != null)
                return false;
        }
        else if (!matricula.equals(other.matricula))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Estudiante: {" +
                "Matrícula='" + matricula + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Teléfono='" + telefono + '\'' +
                '}';
    }
}
