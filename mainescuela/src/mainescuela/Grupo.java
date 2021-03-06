
package mainescuela;

import java.util.ArrayList;
public class Grupo {
    private String nombre;
    private ArrayList <Alumno> alumnos;
    private Profesor prof; 
   // private Proftitular profesortitular; //clase hija de profesor
   // private Profinvitado profesorinvitado;
    // private Profmediotiempo profesormediotiempo;
    private ArrayList <Profesor> profesores;
    
    private static int numGrupos=0;
    
    public Grupo(String nombre){
        this.nombre=nombre;
        numGrupos++;
        alumnos = new ArrayList<>();
        profesores = new ArrayList<>();
    }
    

    public void asignarProf(Proftitular p){
        prof=p;
    }

    public void asignarProf(Profmediotiempo p){
        prof=p;
    }

    public void asignarProf(Profinvitado i){
        prof=i;
    }
    
    public void addAlumno(Alumno a){
        alumnos.add(a);
    }

    public void addProfe(Profesor prof){
        profesores.add(prof);
    }
    
    public void mostrarAlumnos(){
        for(Alumno aux : alumnos){
            System.out.println(aux);
        }
    }

    public void mostrarProfesores(){
        for(Profesor aux : profesores){
            System.out.println(aux);
        }
    }
    
    public String  getNomGrup(){
        return nombre;
    }
    
    public Profesor  getProf(){
        return prof;
    }
    
    public static int numGrupos(){
        return numGrupos;
    }
    
}
