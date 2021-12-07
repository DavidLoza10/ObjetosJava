import org.w3c.dom.ls.LSOutput;

public class Persona {

    private String nombre;
    private String apellido;
    private String segudnoNombre;
    private String segudnoApellido;
    private int edad;
    private String especialidad;

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getSegudnoNombre() { return segudnoNombre; }

    public void setSegudnoNombre(String segudnoNombre) { this.segudnoNombre = segudnoNombre; }

    public String getSegudnoApellido() { return segudnoApellido; }

    public void setSegudnoApellido(String segudnoApellido) { this.segudnoApellido = segudnoApellido; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) { this.edad = edad; }

    public String getEspecialidad() { return especialidad; }

    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getNombreCompleto() {

        String nombreCompleto = this.nombre + " " + this.apellido;
        return nombreCompleto;
    }

    public String getNombreCompletoTodo(){

        String nombreTodoCompleto = this.nombre + " " + this.segudnoNombre + " " + this.apellido + " " + this.segudnoApellido;
        return nombreTodoCompleto;
    }

    public String getEspecialidadPerson(){

        String especialidadPersona = this.nombre + " " + this.apellido + " es " + this.especialidad;
        return especialidadPersona;
    }
}
