package TrabajoLaboratorio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrarCitas extends Paciente{

    private int id;
    private String fechaCita;
    private String horaCita;
    private String motivoCita;

    public RegistrarCitas(String nombre, String apellido, String dni, String direccion, String telefono, String correo, String fechaCita, String horaCita, String motivoCita) {
        super(nombre, apellido, dni, direccion, telefono, correo);
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.motivoCita = motivoCita;
    }

    public String getFechaCita() {
        return this.fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return this.horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getMotivoCita() {
        return this.motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public String obtenerFechaFormateada() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(this.fechaCita);
    }
}
