package EjercicioT8;


class Persona {
    private int edad;
    private String nombre;
    private String telefono;


    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(40);
        persona.setNombre("Pedro");
        persona.setTelefono("123456789");

        System.out.println(persona.getNombre()+" "+ persona.getEdad());
        System.out.println(persona.getTelefono());





    }
}

