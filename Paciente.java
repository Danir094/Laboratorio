package TrabajoLaboratorio;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class Paciente {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String correo;
    private String CodPaciente;

    public Paciente(String nombre, String apellido, String dni, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodPaciente() {
        return this.CodPaciente;
    }

    public String obtenerInformacion() {
        new SimpleDateFormat("dd-MM-yyyy");
        return "DNI: " + this.dni + ", Nombre: " + this.nombre + " " + this.apellido + ", Dirección: " + this.direccion + ", Celular: " + this.telefono + ", Correo: " + this.correo;
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
