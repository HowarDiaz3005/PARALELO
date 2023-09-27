import java.util.Scanner;

public class ReservaAerolinea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tipo de voleto que usted porta\n1. PRIMERA CLASE\n2. CLASE DE NEGOCIOS\n3. CLASE ECONOMICA");
        int Boleto = scanner.nextInt();
        
        switch (Boleto)
        {
            case 1:
            System.out.println("BIENVENIDO A SU VUELO BOLETO PRIMERA CLASE");
            System.out.println("Ingrese la fila que desea sentarse\n1. FILA 1.\n2. FILA 2.");
            int fila1 = scanner.nextInt();
            System.out.println("Ingrese en que columna desea sentarse\n1. COLUMNA 1.\n2. COLUMNA 2.\n3. COLUMNA 3.\n4. COLUMNAS 4.\n5. COLUMNAS 5.\n6. COLUMNA 6.");
            int col1 = scanner.nextInt();
            System.out.println("FILA 1   * * X * X X\nFILA 2   * X * X * X\nFILA 3   * * X X * X\nFILA 4   X * X * X X\nFILA 5   * X * X * *\nFILA 6   * X * * * X\nFILA 7   X * * * X X\nFILA 8   * X * X X *\nFILA 9   X * X X * X\nFILA 10  * X * X X X\nFILA 11  * * X * X *\nFILA 12  * * X X * X\nFILA 13  * * X * X *");
               
            if (fila1 == 1 && col1 == 1)
            {
                System.out.print("BIENVENIDO USTED SI PUEDE ABORDAR EN NUESTRO AVION");
            }
            else if (fila1 == 1 && col1 ==2)
            {
                System.out.print("BIENVENIDO USTED SI PUEDE ABORDAR EN NUESTRO AVION");
            }
            else if (fila1 == 1 && col1 ==3)
            {
                System.out.print("DISCULPE, ASIENTO OCUPADO");
            }
            else if (fila1 == 1 && col1 ==4)
            {
                System.out.print("BIENVENIDO USTED SI PUEDE ABORDAR EN NUESTRO AVION");
            }
            else if (fila1 == 1 && col1 ==5)
            {
                System.out.print("DISCULPE, ASIENTO OCUPADO");
            }
            else if (fila1 == 1 && col1 ==6)
            {
                System.out.print("DISCULPE, ASIENTO OCUPADO");
            }
            else if (fila1 == 2 && col1 == 1)
            {
                System.out.print("BIENVENIDO USTED SI PUEDE ABORDAR EN NUESTRO AVION");
            }
            else if (fila1 == 2 && col1 == 2)
            {
                System.out.print("DISCULPE, ASIENTO OCUPADO");
            }
            else if (fila1 == 2 && col1 == 3)
            {
                System.out.print("BIENVENIDO USTED SI PUEDE ABORDAR EN NUESTRO AVION");
            }
            else if (fila1 == 2 && col1 == 4)
            {
                System.out.print("DISCULPE, ASIENTO OCUPADO");
            }
            else if (fila1 == 2 && col1 == 5)
            {
                System.out.print("BIENVENIDO USTED SI PUEDE ABORDAR EN NUESTRO AVION");
            }
            else if (fila1 == 2 && col1 == 6)
            {
                System.out.print("DISCULPE, ASIENTO OCUPADO");
            }
 
            break;

            case 2:
            System.out.println("BIENVENIDO A SU VUELO BOLETO CLASE DE NEGOCIOS");
            System.out.println("Ingrese la fila que desea sentarse\n1. FILA 3.\n2. FILA 4.\n3. FILA 5.\n4.FILA 6.\n5. FILA 7.");
            int fila2 = scanner.nextInt();
            System.out.println("Ingrese en que columna desea sentarse\n1. COLUMNA 1.\n2. COLUMNA 2.\n3. COLUMNA 3.\n4. COLUMNAS 4.\n5. COLUMNAS 5.\n6. COLUMNA 6.");
            int col2 = scanner.nextInt();
            System.out.println("FILA 1   * * X * X X\nFILA 2   * X * X * X\nFILA 3   * * X X * X\nFILA 4   X * X * X X\nFILA 5   * X * X * *\nFILA 6   * X * * * X\nFILA 7   X * * * X X\nFILA 8   * X * X X *\nFILA 9   X * X X * X\nFILA 10  * X * X X X\nFILA 11  * * X * X *\nFILA 12  * * X X * X\nFILA 13  * * X * X *");
             if (fila2 == 1 && col2 ==1)
            {

            }
            else if (fila2 == 1 && col2 ==2)
            {

            }
            else if (fila2 == 1 && col2 ==3)
            {

            }
            else if (fila2 == 1 && col2 ==4)
            {

            }
            else if (fila2 == 1 && col2 ==5)
            {

            }
            else if (fila2 == 1 && col2 ==6)
            {

            }
            else if (fila2 == 2 && col2 ==1)
            {

            }
            else if  (fila2 == 2 && col2 == 2)
            {

            }
            else if (fila2 == 2 && col2 == 3)
            {

            }
            else if (fila2 == 2 && col2 == 4)
            {

            }
            else if (fila2 == 2 && col2 == 5)
            {

            }
            else if (fila2 == 2 && col2 == 6)
            {

            }
            else if (fila2 == 3 && col2 == 1)
            {

            }
            else if (fila2 == 3 && col2 == 2)
            {

            }
            else if (fila2 == 3 )
            


            break;

            case 3:
            System.out.println("BIENVENIDO A SU VUELO BOLETO CLASE ECONOMICA");
            System.out.println("Ingrese la fila que desea sentarse\n1. FILA 8.\n2. FILA 9.\n3. FILA 10.\n4. FILA 11.\n5. FILA 12\n6. FILA 13");
            int fila3 = scanner.nextInt();
            System.out.println("Ingrese en que columna desea sentarse\n1. COLUMNA 1.\n2. COLUMNA 2.\n3. COLUMNA 3.\n4. COLUMNAS 4.\n5. COLUMNAS 5.\n6. COLUMNA 6.");
            int col3 = scanner.nextInt();
            System.out.println("FILA 1   * * X * X X\nFILA 2   * X * X * X\nFILA 3   * * X X * X\nFILA 4   X * X * X X\nFILA 5   * X * X * *\nFILA 6   * X * * * X\nFILA 7   X * * * X X\nFILA 8   * X * X X *\nFILA 9   X * X X * X\nFILA 10  * X * X X X\nFILA 11  * * X * X *\nFILA 12  * * X X * X\nFILA 13  * * X * X *");
                

            break;
        }
    }
}
        