package TrabajoLaboratorio;

import java.util.Iterator;
import java.util.List;

public class ListarCitas {
    public ListarCitas() {
    }

    public static void mostrarCitas(List<Cita> citas) {
        if (citas.isEmpty()) {
            System.out.println("No hay cita registrada.");
        } else {
            System.out.println("aquí está la cita:");
            Iterator var1 = citas.iterator();

            while(var1.hasNext()) {
                Cita cita = (Cita)var1.next();
                System.out.println(cita.obtenerInformacioCita());
            }
        }

    }
}
