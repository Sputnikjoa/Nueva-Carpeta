
package mainescuela;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private static int materias=0;
    private int calificacion;
    private ArrayList<Profesor> Profesores;
    
    public Materia(String nombre){
        this.nombre=nombre;
        materias++;
        calificacion=0;
        Profesores = new ArrayList<>();
    }
    public static int numMaterias(){
        return materias;
    }
    public String getMateria(){
        return nombre;
    }
    public void setCalificacion(int c){
        calificacion=c;
    }
    public int getCalificacion(){
        return calificacion;
    }

    public ArrayList<Profesor> setProfesores() {
        return Profesores;
    }

     public void agregarProfesor(Profesor p){
        Profesores.add(p);
    }

    public void setProfesores(ArrayList<Profesor> Profesores) {
        this.Profesores = Profesores;
    }
    
    public String toString (){
        return "Materia: "+nombre;
    }

    public void imprimirProfesores(){
        for(Profesor aux : Profesores){
            System.out.println(aux.getNombre());
        }
    }
    
}