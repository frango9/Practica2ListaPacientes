
public class Aplicacion {

    public static void main(String[] args) {

        Paciente p1 = new Paciente("Alberto","Frecuentes mareos");
        Paciente p2 = new Paciente("Ana","Infeccion resistente");
        Paciente p3 = new Paciente("Eva", "Problemas digestivo");
        Paciente p4 = new Paciente("Ernesto", "Problemas cardiovasculares");

        ListaOrdinal Pacientes = new ListaOrdinal();

        Pacientes.insertar(p1);
        Pacientes.insertar(p2);
        Pacientes.insertar(p3);
        Pacientes.insertar(p4);

        p2.darAlta();
        p3.darAlta();

        Pacientes.borrarAltas();
        Iterador I = Pacientes.obtenerIterador();

        System.out.println("PACIENTES DEL HOSPITAL: ");

        while(I.hasNext()){
            I.next().verPaciente();
        }

        //Pacientes.borrarAltas();


    }
}