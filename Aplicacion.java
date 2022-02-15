
public class Aplicacion{
    public static void main( String args[] ){
        Persona alex = new Persona( "Alex", "Martinez", 25, 12345 );
        Persona martha = new Persona();

        System.out.println( alex.getNombre() + " " + alex.getApellido() );
        System.out.println( martha.getNombre() + " " + martha.getApellido() );

        martha.setNombre( "Martha" );
        martha.setApellido( "Garcia" );
        martha.setEdad( 24 );
        martha.setIdentificador( 98765 );

        System.out.println( martha.getNombre() + " " + martha.getApellido() );

        System.out.println( martha.toString() );

        String resultado = martha.comparaEdad( alex );
        System.out.println( resultado );
    }
}