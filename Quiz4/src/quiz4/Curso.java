/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

/**
 *
 * @author Marco
 */
public class Curso {
    public String nombres;
    public String curso;
    public String profesor;
    public int nota;
    
    public Curso(){
        this.nombres="";
        this.curso="";
        this.profesor="";
        this.nota=0;
        
    }
    

    public Curso(String nombres, String curso, String profesor, int nota) {
        this.nombres = nombres;
        this.curso = curso;
        this.profesor = profesor;
        this.nota = nota;
    }
    

    
    
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
    
}
