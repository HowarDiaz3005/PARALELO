import java.util.Scanner;

public class App1
{
    public static void main(String []args) throws Exception
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Hasta que tabla de multiplicar desea ver?");
        byte pref = lector.nextByte();
        byte det = 1, num = 1;


        while (num <= pref)
        {
            while (det <=10)
            {
                System.out.println(num + " x " + det + " = " + num*det);
                pref++;
            }
            det = 1;
            num++;
        }
        lector.close();
    }
}