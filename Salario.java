import java.util.Scanner;
import java.util.*;

public class Salario
{
    static final double tasaINSS = 0.7;
    static final double tasaIR = 15.6;
    static final double tasaINSSPatronal = 22.5;
    static final double tasaSindicato = 1.0;
    static final double tasaAntiguedad = 15.0;
    public static void main(String[] agrs) throws Exception
    {
        // DECLARACION DE VARIABLES....
        double SalarioBruto, ingresoNeto, ingresoTotal;
        double ingresoAntiguedad, deduccionesTotales;
        double deduccionINSS, deduccionIR, deduccionSindicato;
        double deduccionINSSPatronal;
        // PEDIR LOS DATOS AL USUARIO.....

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su salario bruto/basico:");
        SalarioBruto = lector.nextDouble();

        ingresoAntiguedad = SalarioBruto * (tasaAntiguedad/100);
        ingresoTotal = SalarioBruto + ingresoAntiguedad;
        deduccionSindicato = SalarioBruto * (tasaSindicato/100);
        deduccionINSS = ingresoTotal * (tasaINSS/100);
        deduccionIR = ingresoTotal * (tasaIR/100);
        deduccionesTotales = deduccionINSS + deduccionIR + deduccionSindicato;
        ingresoNeto = ingresoTotal + deduccionesTotales;
        deduccionINSSPatronal = ingresoTotal * (tasaINSSPatronal);

        System.out.println("REPORTE DE SALARIO MENSUAL");
        System.out.println("::::::::::::::::::::::::::");
        System.out.println("Salario bruto: C$" + SalarioBruto );
        System.out.println("Ingresos por antiguedad: "+ ingresoAntiguedad);
        System.out.println("Ingresos Totales: C$ "+ ingresoTotal);
        System.out.println("::::::::::::::::::::::::::::");
        System.out.println("Deduccion por INSS: C$" + deduccionINSS);
        System.out.println("Deduccion por IR: C$" + deduccionIR);
        System.out.println("Deduccion por afiliacion al sindicato: C$" + deduccionSindicato);
        System.out.println("Deducciones totales: C$" + deduccionesTotales);
        System.out.println("::::::::::::::::::::::::::::");
    }
}