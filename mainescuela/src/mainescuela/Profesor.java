
package mainescuela;
import java.util.ArrayList;

public class Profesor {
    private int matricula;
    private String nombre;
    private String correo;
    private ArrayList<Materia> materias;
    private ArrayList<Grupo> grupos;
    private double sueldo = 0;

    private static int profesor = 0;

    public Profesor(int matricula, String nombre, String correo){
        this.matricula=matricula;
        this.nombre=nombre;
        this.correo=correo;
        grupos = new ArrayList<>();
        materias = new ArrayList<>();
        profesor++;
    }

    public String getNombre() {
        return nombre;
    }

    public static int numProf(){
        return profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }


    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSueldo() {
        return Double.toString(sueldo);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void informacion() {
        System.out.println("Matricula: " + matricula + ", Nombre: " + nombre + ", Correo: " + correo +  ", Sueldo: $" + sueldo);
    }

    public String toString(){
        return "---------------\nMatricula: " + matricula + "\nNombre profesor: " + nombre + "\nCorreo: " + correo;
    }

}


