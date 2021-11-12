
package mainescuela;

public class Materia {
    private String nombre;
    
    private static int materias=0;
    
    public Materia(String nombre){
        this.nombre=nombre;
        materias++;
    }
    public static int numMaterias(){
        return materias;
    }
    public String getMateria(){
        return nombre;
    }
    
    public String toString (){
        return "Materia: "+nombre;
    }
    
}