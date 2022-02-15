
public class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private int identificador;

    public Persona(){
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.edad = -1;
        this.identificador = -1;
    }

    public Persona( String nombre, String apellido, int edad, int identificador ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificador = identificador;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getEdad(){
        return this.edad;
    }

    public int getIdentificador(){
        return this.identificador;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    public void setApellido( String apellido ){
        this.apellido = apellido;
    }

    public void setEdad( int edad ){
        this.edad = edad;
    }

    public void setIdentificador( int identificador ){
        this.identificador = identificador;
    }

    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
               "Apellido: " + getApellido() + "\n" + 
               "Edad: " + this.edad + "\n" +
               "Identificador: " + this.identificador;
    }

    public String comparaEdad( Persona persona ){
        if ( this.edad < persona.getEdad() ){
            return this.nombre + " es menor que " + persona.getNombre();
        }
        else{
            return persona.getNombre() + " es menor que " + this.nombre;
        }
    }
}


