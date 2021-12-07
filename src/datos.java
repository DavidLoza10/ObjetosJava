public class datos {
    public static void main (String [ ] args) {

        Persona persona = new Persona();
        persona.setNombre("David");
        persona.setApellido("Loza");
        persona.setEdad(30);

        persona.setEspecialidad("Futbolista Profesional");

        persona.setSegudnoNombre("Edwin");
        persona.setSegudnoApellido("Garzón");

        String name = persona.getNombre();
        String last = persona.getApellido();
        int age = persona.getEdad();
        String namedos = persona.getSegudnoNombre();
        String lastdos = persona.getSegudnoApellido();

        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + last);
        System.out.println("Edad: " + age);
        System.out.println("Segundo Nombre: "+ namedos);
        System.out.println("Segundo Apellido: "+lastdos);

        String completo = persona.getNombreCompleto();
        System.out.println(completo);
        System.out.println("");

        String todoCompleto = persona.getNombreCompletoTodo();
        System.out.println(todoCompleto);

        String especilidadPers = persona.getEspecialidadPerson();
        System.out.println(especilidadPers);

        Animal animal = new Animal();

        Lapiz lapiz = new Lapiz();
    }
}
