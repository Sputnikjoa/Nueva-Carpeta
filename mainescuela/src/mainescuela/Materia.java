
package mainescuela;

public class Materia {
    private String nombre;
    private static int materias=0;
    private int calificacion;
    
    public Materia(String nombre){
        this.nombre=nombre;
        materias++;
        calificacion=0;
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
    
    public String toString (){
        return "Materia: "+nombre;
    }
    
}