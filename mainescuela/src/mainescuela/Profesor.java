/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainescuela;

import java.util.ArrayList;

/**
 *
 * @author joapi
 */
public class Profesor {
    private int matricula;
    public String nombre;
    private String correo;
    ArrayList<Grupo> grupos;

    public Profesor(int matricula, String nombre, String correo){
        this.matricula=matricula;
        this.nombre=nombre;
        this.correo=correo;
        grupos = new ArrayList<>();
    }

}
