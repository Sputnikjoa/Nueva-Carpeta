
package mainescuela;

public class Mainescuela {

    public static void main(String[] args) {
         //Creacion de la universidad
        Escuela escuela1 = new Escuela("ESCOM");
        System.out.println("Nombre de la escuela: " + escuela1.getNombre());
        
        //Creacion de las materias
        Materia materia1 = new Materia("Algebra lineal");
        Materia materia2 = new Materia("Fundamentos programacion");
        Materia materia3 = new Materia("Paradigmas programacion");
        Materia materia4 = new Materia("Finanzas empresariales");
        Materia materia5 = new Materia("Bases de datos");
        Materia materia7 = new Materia("Algoritmos");
        Materia materia8 = new Materia("Matematicas avanzadas");

        //Creacion de los profesores
        Proftitular profesor1 = new Proftitular(1234, "Juan Perez", "juanprz@hotmail.com");
        Proftitular profesor2 = new Proftitular(2345, "Angel", "angel@hotmail.com");
        Profmediotiempo profesor3 = new Profmediotiempo(3456, "Jair", "jair@hotmail.com","matutino");
        Proftitular profesor4 = new Proftitular(4567, "Raul", "raulhn@hotmail.com");
        Profinvitado profesor5 = new Profinvitado(5678, "Javier", "javierr@hotmail.com","17/6/2020","18/7/2022");
        Profinvitado profesor6 = new Profinvitado(6789, "Tamara Rubio", "tmra@hotmail.com","10/1/2019","10/1/2022");
        Proftitular profesor7 = new Proftitular(7890, "Monserrat Huerta", "monsett@hotmail.com");

        System.out.println("\n---->Obteniendo informacion del profesor 1");
        profesor1.informacion();

        System.out.println("\n---->Utilizando setter para poner el sueldo a profesores");
        profesor1.setSueldo(5434);
        System.out.println("---->Informacion del profesor1 despues de poner el sueldo");
        profesor1.informacion();
        System.out.println("\n---->Asignandoles sueldo a otros dos profesores y mostrar su informacion");
        profesor5.setSueldo(2340);
        profesor5.informacion();
        profesor3.setSueldo(34000.5);
        profesor3.informacion();

        //Creacion de alumnos y agregarlos a la escuela
        Alumno alum1 = new Alumno("Jorge Manuel", 2018000, 3,"Presencial");
        Alumno alum2 = new Alumno("Joaquin", 2018001, 3,"Presencial");
        Alumno alum3 = new Alumno("Joel", 2018002, 4,"Distancia");
        Alumno alum4 = new Alumno("Carlos", 2019012, 4,"Distancia");

        System.out.println("Agregando los alumnos a la escuela");
        escuela1.agregarAlumno(alum1);
        escuela1.agregarAlumno(alum2);
        escuela1.agregarAlumno(alum3);
        escuela1.agregarAlumno(alum4);

        //Creacion de grupos
        Grupo grupo35 = new Grupo("3CM5");
        Grupo grupo37 = new Grupo("3CM7");
        //Agregando profesores a un grupo
        //Aqui debemos agregar de manera simultanea profesor al grupo y grupo a profesor.
        grupo35.addProfe(profesor1);
        profesor1.agregarGrupo(grupo35);
        materia1.agregarProfesor(profesor1);
        profesor1.agregarMateria(materia1);
        
        grupo35.addProfe(profesor2);
        profesor2.agregarGrupo(grupo35);
        materia2.agregarProfesor(profesor2);
        profesor2.agregarMateria(materia2);

        grupo35.addProfe(profesor3);
        profesor3.agregarGrupo(grupo35);
        materia3.agregarProfesor(profesor3);
        profesor3.agregarMateria(materia3);

        grupo35.addProfe(profesor4);
        profesor4.agregarGrupo(grupo35);
        materia4.agregarProfesor(profesor4);
        profesor4.agregarMateria(materia4);
        
        grupo37.addProfe(profesor4);
        profesor4.agregarGrupo(grupo37);
        materia8.agregarProfesor(profesor4);
        profesor4.agregarMateria(materia8);

        grupo37.addProfe(profesor5);
        profesor5.agregarGrupo(grupo37);
        materia5.agregarProfesor(profesor5);
        profesor5.agregarMateria(materia5);

        grupo37.addProfe(profesor6);
        profesor6.agregarGrupo(grupo37);
        materia7.agregarProfesor(profesor6);
        profesor6.agregarMateria(materia7);

        grupo37.addProfe(profesor7);
        profesor7.agregarGrupo(grupo37);
        materia7.agregarProfesor(profesor7);
        profesor7.agregarMateria(materia7);

        //Agregando alumnos a los grupos
        grupo35.addAlumno(alum1);
        grupo35.addAlumno(alum2);
        grupo37.addAlumno(alum3);
        grupo37.addAlumno(alum4);

        System.out.println("\nLos profesores del gruo 3CM5 son: ");
        grupo35.mostrarProfesores();
        System.out.println("\nLos alumnos del grupo 3CM5 son: ");
        grupo35.mostrarAlumnos();

        System.out.println("\nLos profesores del grupo 3CM7 son: ");
        grupo37.mostrarProfesores();
        System.out.println("\nLos alumnos del grupo 3CM7 son: ");
        grupo37.mostrarAlumnos();

        
        System.out.println("\nGrupos del profesor1: ");
        profesor1.imprimirGrupos();

        System.out.println("\nGrupos del profesor4: ");
        profesor4.imprimirGrupos();

        System.out.println("\n");
        //Insertar calificaciones al alumno
        alum1.agregarMateria(materia1);
        alum1.agregarCalificacion(materia1.getMateria(), 9);
        alum1.agregarMateria(materia2);
        alum1.agregarCalificacion(materia2.getMateria(), 6);
        alum1.imprimirCalificaciones();

        //personal administrativo y agregarlos a la escuela
        personalAdm trabajador1 = new personalAdm("Juan Perez",10,"Conserje",3500.00);
        personalAdm trabajador2 = new personalAdm("Carlos Rivera", 11, "Analista", 10000.00);
        escuela1.agregarpersonal(trabajador1);
        escuela1.agregarpersonal(trabajador2);

        System.out.println("\nDatos de escuela:");
        escuela1.imprimirDatosGen();

        System.out.println("\nMaterias del profesor 4:");
        profesor4.imprimirMaterias();

        System.out.println("\nProfesores que imparten la materia de Finanzas Empresariales:");
        materia7.imprimirProfesores();
        
    }
    
}
