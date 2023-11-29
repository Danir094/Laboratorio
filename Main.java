package TrabajoLaboratorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    int idCita = 1;

    public Main() {
    }

    public static void main(String[] args) {
        PruebasIndividuales prueba1 = new PruebasIndividuales("Hemograma");
        PruebasPaquetes paquet1 = new PruebasPaquetes("1");
        System.out.println(prueba1.PruebasInd());
        System.out.println(paquet1.PaquetesPrueb());
        Scanner scanner = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList();
        List<Cita> nuevacita = new ArrayList();
        System.out.printf("BIEN VENIDO A MULTILAB!");
        System.out.println("Seleecione una opcion:\n1. Pacientes\n2. Registrar Cita\n3. Vizualizar Cita\n4. Pruebas Medicas\n5. Resultados\n5. Salir");
        System.out.println("Por favor digite la opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("DNI: ");
                String dni = scanner.next();
                System.out.print("Nombre: ");
                String nombre = scanner.next();
                System.out.print("Apellidos: ");
                String apellidos = scanner.next();
                System.out.print("fechaNacimiento: ");
                String fechaNacimiento = scanner.next();
                System.out.print("Dirección: ");
                String direccion = scanner.next();
                System.out.print("Telefono: ");
                String telefono = scanner.next();
                System.out.print("Correo: ");
                String correo = scanner.next();
                Paciente nuevoPaciente = new Paciente(nombre, apellidos, dni, direccion, telefono, correo);
                pacientes.add(nuevoPaciente);
                System.out.println("Paciente registrado con éxito.");
                break;
            case 2:
                System.out.print("ID del Paciente: ");
                String dniPaciente = scanner.next();
                Paciente pacienteSeleccionado = buscarPacientePorDNI(dniPaciente, pacientes);
                if (pacienteSeleccionado != null) {
                    System.out.print("Fecha de Cita (yyyy-MM-dd): ");
                    String fechaCitaStr = scanner.next();
                    System.out.print("Hora de Cita: ");
                    String horaCita = scanner.next();
                    System.out.print("Motivo de Cita: ");
                    String motivoCita = scanner.next();
                    Cita cita1 = new Cita(pacienteSeleccionado.getNombre(), pacienteSeleccionado.getApellido(), pacienteSeleccionado.getDni(), pacienteSeleccionado.getDireccion(), pacienteSeleccionado.getTelefono(), pacienteSeleccionado.getCorreo(), fechaCitaStr, horaCita, motivoCita);
                    nuevacita.add(cita1);
                    System.out.println("Cita registrada con éxito.");
                } else {
                    System.out.println("Paciente no encontrado.");
                }
                break;
            case 3:
                ListarPacientes.mostrarListaPacientes(pacientes);
            case 4:
            case 5:
                break;
            case 6:
                System.out.println("Saliendo del programa.");
                System.exit(0);
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }

    }

    private static Paciente buscarPacientePorDNI(String dni, List<Paciente> pacientes) {
        Iterator var2 = pacientes.iterator();

        Paciente paciente;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            paciente = (Paciente)var2.next();
        } while(!paciente.getDni().equals(dni));

        return paciente;
    }
}
