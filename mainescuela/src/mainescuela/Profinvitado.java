package mainescuela;

public class Profinvitado extends Profesor {
    String fecha_contrato;
    String fecha_final;

    public Profinvitado(int matricula, String nombre, String correo, String fecha_contrato, String fecha_final){
        super(matricula, nombre, correo);
        this.fecha_contrato=fecha_contrato;
        this.fecha_final=fecha_final;
        tipo="invitado";
    }

    public String getContrato(){
        return ("El profesor invitado: " + getNombre() + "\nfecha inicio de contrato:"+ fecha_contrato +"fecha final:"+ fecha_final);
    }
    public String getfechacontrato(){
        return fecha_contrato;
    }
    public String getfechafinal(){
        return fecha_final;
    }
    
    //redefinicion de metodos
     @Override
     public void informacion() {
        System.out.println("Matricula: " + matricula + ", Tipo: "+ tipo+ "\n Nombre: " + nombre + ", Correo: " + correo +  ", Sueldo: $" + sueldo + ", Fecha de contrato " + fecha_contrato + ", Fecha fin " + fecha_final);
    }

}
