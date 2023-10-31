public class App
{
    public static void main(String[] args) throws Exception
    {
        Pelicula endgame = new Pelicula();

        endgame.establecerNombre("Avenger: Endgame");
        endgame.establecerNombre("Endgame");
        endgame.establecerDuracion(125);
        endgame.establecerCalidad("4K");
        endgame.establecerClasificacion("PG-13");
        endgame.establecerGenero("Ciencia Ficcion");
    
        System.out.pritln("Nombre: " + endgame.mostrarNombre());
        System.out.pritln("Duracion: " + endgame.mostrarDuracion()) + "minutos";
        System.out.pritln("Calidad: " + endgame.mostrarCalidad());
        System.out.pritln("Clasificacion: " + endgame.mostrarClasificacion());
        System.out.pritln("Genero: " + endgame.mostrarGenero());
        System.out.pritln("===================================================");
        Pelicula justiceleague = new Pelicula("Justice League", 240, "Ciencia Ficcion", "8K", "R");
        System.out.pritln("Nobre: " + justiceleague.mostrarNombre());
        System.out.pritln("Duracion: " + justiceleague.mostrarDuracion());
        System.out.pritln("Calidad: " + justiceleague.mostrarCalidad());
        System.out.pritln("Clasificacion: " + justiceleague.mostrarClasificacion());
        System.out.pritln("Genero: " + justiceleague.mostrarGenero());
        System.out.pritln("===================================================");
        
    }
}