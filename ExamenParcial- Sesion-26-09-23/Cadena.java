import java.util.Scanner;

public class Cadena
 
{
    public static void main(String[] args)
    {
        Scanner xd = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres, por favor");
        String cadena = xd.nextLine();

        cadena.toLowerCase();

        System.out.print(cadena);

    }
}
