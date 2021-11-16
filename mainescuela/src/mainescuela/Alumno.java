
package mainescuela;

import java.util.*;

public class Alumno {
    private String nombre;
    private int numeroBoleta;
    private ArrayList<Materia> materiaCursa;
    //private Grupo grupo;
    private ArrayList<Grupo> grupos;
    private int semestre;
    
    private static int alumnos=0;
    
    public Alumno(String nombreAl,int boleta,int semestre){
        nombre=nombreAl;
        this.semestre=semestre;
        numeroBoleta=boleta;
        materiaCursa = new ArrayList<>();
        grupos = new ArrayList<>();
        alumnos++;
    }
    public static int numAlumnos(){
        return alumnos;
    }
    
    public void agregarGrupo(Grupo gpo){
        grupos.add(gpo);
    }

    public void agregarMateria(Materia m){
        materiaCursa.add(m);
    }
    
    public String toString(){
        return "---------------\nNumero de boleta: "+numeroBoleta+"\nNombre alumno: "+nombre;
    }
    
    public int getsemestre(){
        return semestre;
    }
    
    public void imprimirMaterias (){
        int i=1;
        for(Materia aux: materiaCursa){
            System.out.println("Materia [" + i + "] que cursa:"+aux.getMateria());
            i++;
        }
    }

    public void agregarCalificacion(String materia, int calificacion){
        for(Materia aux: materiaCursa){
            if(aux.getMateria().equals(materia)){
                aux.setCalificacion(calificacion);
            }
        }
    }

    public void imprimirCalificaciones(){
        System.out.println("Calificaciones de " + nombre + ":");
        for(Materia aux: materiaCursa){
            System.out.println(aux.getMateria()+" = "+ aux.getCalificacion());
        }
    }
    
}