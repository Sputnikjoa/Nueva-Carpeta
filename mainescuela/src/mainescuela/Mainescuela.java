
package mainescuela;

import javax.sound.sampled.SourceDataLine;

public class Mainescuela {

    public static void main(String[] args) {
        //Creacion de la universidad
        Escuela escuela1 = new Escuela("ESCOM");
        System.out.println(escuela1.getNombre());
        
        //Creacion de las materias
        Materia materia1 = new Materia("Algebra lineal");
        Materia materia2 = new Materia("Fundamentos programacion");
        Materia materia3 = new Materia("Paradigmas programacion");
        Materia materia4 = new Materia("Finanzas empresariales");
        Materia materia5 = new Materia("Bases de datos");
        Materia materia6 = new Materia("Circuitos electricos");
        Materia materia7 = new Materia("Algoritmos");
        Materia materia8 = new Materia("Matematicas avanzadas");

        //Creacion de los profesores
        Proftitular profesor1 = new Proftitular(1234, "Juan Perez", "juanprz@hotmail.com");
        Profesor profesor2 = new Profesor(2345, "Angel", "angel@hotmail.com");
        Profesor profesor3 = new Profesor(3456, "Jair", "jair@hotmail.com");
        Profesor profesor4 = new Profesor(4567, "Raul", "raulhn@hotmail.com");
        Profesor profesor5 = new Profesor(5678, "Javier", "javierr@hotmail.com");
        Profesor profesor6 = new Profesor(6789, "Tamara", "tmra@hotmail.com");
        Profesor profesor7 = new Profesor(7890, "Monserrat", "monsett@hotmail.com");
        Profesor profesor8 = new Profesor(8901, "Eduardo", "eduardo@hotmail.com");

        profesor1.informacion();
        profesor1.setSueldo(5434);
        profesor1.informacion();

        //Creacion de alumnos y agregarlos a la escuela
        Alumno alum1 = new Alumno("Jorge Manuel", 2018000, 3);
        Alumno alum2 = new Alumno("Joaquin", 2018001, 3);
        Alumno alum3 = new Alumno("Joel", 2018002, 4);
        escuela1.agregarAlumno(alum1);
        escuela1.agregarAlumno(alum2);
        escuela1.agregarAlumno(alum3);

        //Creacion de grupos
        Grupo grupo35 = new Grupo("3CM5");

        //Agregando profesores a un grupo
        //Aqui debemos agregar de manera simultanea profesor al grupo y grupo a profesor.
        grupo35.addProfe(profesor1);
        profesor1.agregarGrupo(grupo35);

        grupo35.addProfe(profesor2);
        profesor2.agregarGrupo(grupo35);

        grupo35.addProfe(profesor3);
        profesor3.agregarGrupo(grupo35);

        grupo35.addProfe(profesor4);
        profesor4.agregarGrupo(grupo35);

        //Agregando alumnos al grupo
        grupo35.addAlumno(alum1);
        grupo35.addAlumno(alum2);

        System.out.println("\nLos profesores del grupo 3CM5 son: ");
        grupo35.mostrarProfesores();
        System.out.println("\nLos alumnos del grupo 3CM5 son: ");
        grupo35.mostrarAlumnos();

        
        System.out.println("\nGrupos del profesor1: ");
        profesor1.imprimirGrupos();

        alum1.agregarMateria(materia1);
        alum1.agregarCalificacion(materia1.getMateria(), 9);
        alum1.agregarMateria(materia2);
        alum1.agregarCalificacion(materia2.getMateria(), 6);
        alum1.imprimirCalificaciones();
        

        System.out.println("Datos de escuela1:\n");
        escuela1.imprimirDatosGen();
    }
    
}
