/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Ciclo {

    Curso curso1[] = new Curso[10];

    public void agregar() {
        int x;
        for (x = 0; x < 10; x++) {
            Curso nuevo = new Curso();
            nuevo.setNombres(JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante"));
            nuevo.setCurso(JOptionPane.showInputDialog(null, "Ingrese el nombre del curso:"));
            nuevo.setProfesor(JOptionPane.showInputDialog(null, "Ingrese el nombre del profesor:"));
            nuevo.setNota(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la nota obtenida")));
            curso1[x] = nuevo;
        }

    }

    public void general() {

        int x;
        int notamayor = 0;
        int notamenor = 100;
        int promedio = 0;
        int presente = 0;
        String mayor = "";
        String menor = "";

 
        for (x = 0; x < curso1.length; x++) {
            
            presente = presente + curso1[x].getNota();
            if (curso1[x].getNota() > notamayor);
                notamayor = curso1[x].getNota();
                mayor = curso1[x].getNombres();

            if (curso1[x].getNota() < notamenor) {
                notamenor = curso1[x].getNota();
                menor = curso1[x].getNombres();
            }
            

            if (curso1[x].getNota() > promedio) {
                
            }
        promedio = presente / 10;

        }
        for (x = 0; x < 10; x++) {
            Curso nuevo = new Curso();
            JOptionPane.showMessageDialog(null, "Nombre estudiante:\n" + curso1[x].getNombres());
            curso1[x] = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
        JOptionPane.showMessageDialog(null, "Nota mayor:" + mayor + "" + notamayor);
        JOptionPane.showMessageDialog(null, "Nota menor:" + menor + "" + notamenor);

    }

}


    

