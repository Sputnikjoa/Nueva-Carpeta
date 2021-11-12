package mainescuela;

public class personalAdm {
    private String nombre;
    private int idTrabajador;
    private String cargo;
    private double sueldo;
    
    private static int personalAdm=0;
    
    public personalAdm(String nombre,int idTrabajador,String cargo, double sueldo){
        this.nombre = nombre;
        this.idTrabajador = idTrabajador;
        this.cargo = cargo;
        this.sueldo = sueldo;
        personalAdm++;
    }
    public static int numpersonalAdm(){
        return personalAdm;
    }
    
    public String toString(){
        return "Id Trabajador: " + idTrabajador + "\nNombre: " + nombre + "\nCargo: " + cargo;
    }
    
    public int getid(){
        return idTrabajador;
    }

    public double getsueldo(){
        return sueldo;
    }

    public String getCargo(){
        return cargo;
    }
    
    
    
}