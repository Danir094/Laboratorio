package TrabajoLaboratorio;

import java.util.Iterator;
import java.util.List;

public class ListarPacientes {
    public ListarPacientes() {
    }

    public static void mostrarListaPacientes(List<Paciente> pacientes) {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            System.out.println("Lista de Pacientes:");
            Iterator var1 = pacientes.iterator();

            while(var1.hasNext()) {
                Paciente paciente = (Paciente)var1.next();
                System.out.println(paciente.obtenerInformacion());
            }
        }

    }
}
