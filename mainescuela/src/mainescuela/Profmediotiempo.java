package mainescuela;

public class Profmediotiempo extends Proftitular{

    String turno;

    public Profmediotiempo(int matricula, String nombre, String correo,String turno){
        super(matricula,nombre,correo);
        this.turno=turno;
        tipo="medio tiempo";
    }

    @Override
     public void informacion() {
        System.out.println("Matricula: " + matricula + ", Tipo: " + tipo + ", Turno: " + turno + "\n Nombre: " + nombre + ", Correo: " + correo +  ", Sueldo: $" + sueldo);
    }

    
}
