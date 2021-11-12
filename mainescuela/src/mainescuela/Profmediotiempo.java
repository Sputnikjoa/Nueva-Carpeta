package mainescuela;

public class Profmediotiempo extends Proftitular{
    private String turno;

    public Profmediotiempo(int matricula, String nombre, String correo,String turno){
        super(matricula,nombre,correo);
        this.turno=turno;
    }
}
