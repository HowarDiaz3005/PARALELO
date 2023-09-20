import java.util.Scanner;

public class ArreglosBidimensionales 
{
    public static void main(String[] args)
    {
        Scanner xd = new Scanner (System.in);

        // Arreglo Bidimensionales
        int matrizB[][] =
        {
            {1,2},{3,4}
        };
        System.out.print("Cantidad de filas: ");
        int CantFilas = xd.nextInt();
        System.out.println("Cantidad de columnas: ");
        int CantColumnas = xd.nextInt();
        int [][] matrizA = new int[CantFilas][CantColumnas];

        System.out.println("Ingrese los elementos de la matriz A: ");
        for (int i = 0; i < matrizA.length; i++)
        {
            for (int j = 0; j < matrizA[i].length; j++)
            {
                System.out.println("Arreglo A[" + i + "," + j + "] =");
            }
        }
    }
}
