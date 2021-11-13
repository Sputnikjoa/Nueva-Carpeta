package mainescuela;

public class Profmediotiempo extends Proftitular{
    public Profmediotiempo(int matricula, String nombre, String correo,String turno){
        super(matricula,nombre,correo);
        this.turno=turno;
        tipo="medio tiempo";
    }
}
