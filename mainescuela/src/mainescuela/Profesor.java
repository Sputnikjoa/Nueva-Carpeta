
package mainescuela;
import java.util.ArrayList;

public class Profesor {
    private int matricula;
    private String nombre;
    private String correo;
    private ArrayList<Grupo> grupos;

    public Profesor(int matricula, String nombre, String correo){
        this.matricula=matricula;
        this.nombre=nombre;
        this.correo=correo;
        grupos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
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

}
