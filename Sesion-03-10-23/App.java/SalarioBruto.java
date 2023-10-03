import java.util.Scanner;

public class SalarioBruto 
{
    public static void main(String[] args) throws Exception
    {
        Scanner xd = new Scanner(System.in);
        IngresoGeneral();
        System.out.println("Su deduccion de Monto de Afiliaciones es: " + MontoAfili + " Su deduccion de INSS es: " + MontoInss + " Su deduccion de IR es: " + MontoIr);
        System.out.println("La suma de sus deducciones es: " + SumaDeducc);
        System.out.println("Su INSS Patronal es: " + InssPatronal);
        System.out.println("Su Ingreso por Antiguedad es: " + IngAnti);
        System.out.println("Su Ingreso Total es: " + IngTotal);  
        System.out.println("Su Ingreso Neto es: " + IngNeto);
    }
    // DECLARACION DE METODOS
    public static double IngresoGeneral()
    {
        System.out.println("Ingrese su salario bruto o básico: ");
        double Salario = xd.nextInt();
        // Ingreso por Antiguedad
        double IngAnti = (Salario*0.15);
        // Ingreso Total
        double IngTotal = (Salario+IngAnti);
        // Ingreso Neto
        double IngNeto = (Salario-SumaDeducc);
        // Deducciones 
        double MontoAfili = (Salario*0.1);
        double MontoInss = (Salario*0.07);
        double MontoIr = (Salario*15.6);
        // ******** SUMA DE DEDUCCIONES **********    
        double SumaDeducc = (MontoAfili+MontoInss+MontoIr); 
        // DEDUCCION EMPRESARIAL INS PATRONAL
        double InssPatronal = (Salario*22.5);
    }
}
