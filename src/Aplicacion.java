
public class Aplicacion {

    public static void main(String[] args) {

        Paciente p1 = new Paciente("Alberto","frecuentes mareos");
        Paciente p2 = new Paciente("Ana","infeccion resistente");
        Paciente p3 = new Paciente("Eva", "problemas digestivo");
        Paciente p4 = new Paciente("Ernesto", "problemas cardiovasculares");

        ListaOrdinal Pacientes = new ListaOrdinal();

        Pacientes.insertar(p1);
        Pacientes.insertar(p2);
        Pacientes.insertar(p3);
        Pacientes.insertar(p4);

        p2.darAlta();
        p3.darAlta();


        Iterador I = Pacientes.obtenerIterador();

        System.out.println("PACIENTES DEL HOSPITAL: ");


        while(I.hasNext()){
            I.next().verPaciente();
        }

        System.out.println("\n*********************************************");

        Paciente p21 = new Paciente("Alberto","Frecuentes mareos");
        Paciente p22 = new Paciente("Ana","Infeccion resistente");
        Paciente p23 = new Paciente("Eva", "Problemas digestivo");
        Paciente p24 = new Paciente("Ernesto", "Problemas cardiovasculares");

        ListaOrdinal Pacientes2 = new ListaOrdinal();

        Pacientes2.insertar(p21);
        Pacientes2.insertar(p22);
        Pacientes2.insertar(p23);
        Pacientes2.insertar(p24);

        p22.darAlta();
        p23.darAlta();

        Pacientes2.borrarAltas();
        Iterador I2 = Pacientes2.obtenerIterador();

        System.out.println("PACIENTES DEL HOSPITAL: ");


        while(I2.hasNext()){
            I2.next().verPaciente();
        }

        System.out.println("\n*********************************************");

        Paciente p31 = new Paciente("Alberto","frecuentes mareos");
        Paciente p32 = new Paciente("Ana","infeccion resistente");
        Paciente p33 = new Paciente("Eva", "problemas digestivo");
        Paciente p34 = new Paciente("Ernesto", "problemas cardiovasculares");

        ListaOrdinal Pacientes3 = new ListaOrdinal();

        Pacientes3.insertar(p31);
        Pacientes3.insertar(p32);
        Pacientes3.insertar(p33);
        Pacientes3.insertar(p34);

        p32.darAlta();
        p33.darAlta();

        System.out.println("PACIENTES CON ALTA: ");
        verAltas(Pacientes3);

        System.out.println("\n*********************************************");



        Iterador I3 =   pacientesSintoma(Pacientes, "mareo" ).obtenerIterador();

        System.out.println("PACIENTES DEL HOSPITAL CON MAREOS: ");


        while(I3.hasNext()){
            I3.next().verPaciente();
        }





    }

    private static void verAltas(ListaOrdinal lista){
        Iterador I2 = lista.obtenerIterador();

        Paciente alta;

        while(I2.hasNext()){

            alta = I2.next();
            if (alta.estaAlta()){
                alta.verPaciente();
            }
        }
    }

    private static ListaOrdinal pacientesSintoma(ListaOrdinal lista, String sintoma){

        ListaOrdinal SintomaDeseado = new ListaOrdinal();
        Iterador I = lista.obtenerIterador();

        Paciente enfermo;

        while(I.hasNext()){

            enfermo = I.next();

            if (enfermo.getSintomas().indexOf(sintoma) != -1){
                SintomaDeseado.insertar(enfermo);
            }
        }

        return SintomaDeseado;


    }
}