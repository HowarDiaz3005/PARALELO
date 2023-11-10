public class App 
{
    public static void main(String[] args) 
    {
        Casa casaAzul = new Casa("Azul");
        Casa otraCasa = casaAzul;

        System.out.println(casaAzul.mostrarColor());
        System.out.println(otraCasa.mostrarColor());

        otraCasa.cambiarColor("Rojo");
        System.out.println(casaAzul.mostrarColor());
        System.out.println(otraCasa.mostrarColor());

         // Objeto o instancia casaVerde

        Casa casaVerde = new Casa ("Verde");
        otraCasa = casaVerde;

        System.out.println(casaAzul.mostrarColor());
        System.out.println(casaVerde.mostrarColor());
        System.out.println(otraCasa.mostrarColor());

        // Objeto o instancia casaVerde

        Casa casaDesconocida = new Casa();

        System.out.println(casaDesconocida.mostrarColor());
        casaDesconocida = casaVerde;
         System.out.println(casaDesconocida.mostrarColor());
         System.out.println(otraCasa.mostrarColor());
    }
}
