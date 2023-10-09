import java.util.Scanner;

public class HowardProject
{
    public static void main(String[] agrs)
    {
        Scanner xd = new Scanner (System.in);
        int Contador = 0; 

        
        for(int i = 0; i < 3; i++)
        {
        
        do
        {
                      System.out.println("HI.. WELCOME.. IN THE ---MENU GEOMETRIC FIGURES---");
          System.out.println("POR FAVOR INGRESE QUE FIGURA DESEA CALCULAR"
                  + "\n1. PRISMA"
                  + "\n2. CILINDRO"
                  + "\n3. PIRAMIDE"
                  + "\n4. CONO"
                  + "\n5. ESFERA"
                  + "\n6. ZONA ESFERICA"
                  + "\n7. TRONCO DE CONO"
                  + "\n8. TRONCO DE PIRAMIDE"
                  + "\n9. ORTOEDRO"
                  + "\n10. TETRAEDRO"
                  + "\n11. HEXAEDRO"
                  + "\n12. OCTAEDRO"
                  + "\n13. DODECAEDRO"
                  + "\n14. ICOSAEDRO"
                  + "\n15. HUSO ESFERICO Y CUÑA ESFERICA"
                  + "\n16.CASQUETE ESFERICO"
                  + "\n17. (SALIR)");
          
                  Contador = xd.nextInt();
          
        }while(Contador <= 0 || Contador >= 17);
            
          

          switch (Contador)
          {
                case 1:
                 System.out.println("........BIENVENIDO A SU CALCULADOR PRISMA........");
                 System.out.println("Ingrese la cantidad de lados de su Prisma : ");
                 int CantLad1 = xd.nextInt();
                 System.out.println("Ingrese la longitud de lados de su Prisma : ");
                 double LongLad1 = xd.nextDouble();
                 System.out.println("Ingrese la altura de su Prisma : ");
                 double alt1 = xd.nextDouble();
                 double PerBase1 = (CantLad1*LongLad1);
                 double ArLat1 = (PerBase1*alt1);
                 Double Af1 = ((Math.PI/180)*(380/CantLad1));
                 double Apo1 =  (LongLad1/(2*Math.tan((Af1)/2)));
                 double ArBas1 = ((PerBase1*Apo1)/2);
                 double ArTot1 = (ArLat1+(2*ArBas1));  
                 double V1 = (ArBas1*alt1);
                 System.out.println("El Area Lateral de su figura Prisma es : " + ArLat1);
                 System.out.println("El Area Total de su figura Prisma es : " + ArTot1);
                 System.out.println("El Volumen de su figura Prisma es : " + V1);
                break;

                case 2:
                 System.out.println("........BIENVENIDO A SU CALCULADOR CILINDRO........");
                 System.out.println("Ingrese el radio de su Cilindro : ");
                 double Rad1 = xd.nextDouble();  
                 System.out.println("Ingrese la altura de su Cilindro : ");
                 double alt2 = xd.nextDouble();     
                 double PerBase2 = ((2*Math.PI)*Rad1);
                 double ArLat2 = (PerBase2*alt2);
                 double ArBas2 = (Math.PI*Math.pow(Rad1,2));
                 double ArTot2 = (ArLat2+(2*ArBas2));
                 double V2 = (ArBas2*alt2);
                 System.out.println("El Area Lateral de su figura Cilindro es : " + ArLat2);
                 System.out.println("El Area Total de su figura Cilindro es : " + ArTot2);
                 System.out.println("El Volumen de su figura Cilindro es : " + V2);
                 break;

                case 3:
                 System.out.println("........BIENVENIDO A SU CALCULADOR PIRAMIDE........");
                 System.out.println("Ingrese la altura de su Piramide : ");
                 double alt3 = xd.nextDouble(); 
                 System.out.println("Ingrese la longitud de lados de su Piramide : ");
                 double LongLads3 = xd.nextDouble(); 
                 System.out.println("Ingrese la anchura de los lados de su Piramide : ");
                 double AnchLads3 = xd.nextDouble();   
                 double PerBase3 = ((2*LongLads3)+(2*AnchLads3));
                 double Apo3 = (LongLads3/2);
                 double ArPir3 = Math.sqrt(Math.pow(alt3,2)+Math.pow(Apo3,2));
                 double ArLat3 = ((PerBase3*ArPir3)/2);
                 double ArTot3 = (ArLat3+PerBase3);
                 double ArBas3 = (LongLads3/2);
                 double V3 = ((ArBas3* alt3)/3);
                 System.out.println("El Area Lateral de su figura Piramide es : " + ArLat3);
                 System.out.println("El Area Total de su figura Piramide es : " + ArTot3);
                 System.out.println("El Volumen de su figura Piramide es : " + V3);
                   break; 

                case 4:
                 System.out.println("........BIENVENIDO A SU CALCULADOR CONO........");
                 System.out.println("Ingrese la altura de su Cono : ");
                 double alt4 = xd.nextDouble();    
                 System.out.println("Ingrese el radio de su Cono : ");
                 double Rad2 = xd.nextDouble();
                 double Gen1 = Math.sqrt(Math.pow(alt4,2) + Math.pow(Rad2,2));
                 double ArLat4 = (Math.PI*(Rad2*Gen1));
                 double ArBas4 = (Math.PI*(Rad2*Rad2));
                 double ArTot4 = (ArLat4+ArBas4);
                 double V4 = ((ArBas4+ArLat4)/3); 
                 System.out.println("El Area Lateral de su Cono es : " + ArLat4);
                 System.out.println("El Area Total de su Cono es : " + ArTot4);
                 System.out.println("El Volumen de su Cono es : " + V4);
                  break; 

                case 5:
                  System.out.println("........BIENVENIDO A SU CALCULADOR ESFERA........");
                  System.out.println("Ingrese el radio de su Esfera : ");
                  double Rad3 = xd.nextDouble();   
                  double Ar = (4*Math.PI*Math.pow(Rad3,2));
                  double V5 = ((4/3)*Math.PI*Math.pow(Ar, 3));
                  System.out.println("El Area de su Esfera es : " + Ar);
                  System.out.println("El Volumen de su Esfera es : " + V5);
                  break;

                case 6:
                 System.out.println("........BIENVENIDO A SU CALCULADOR ZONA ESFERICA........");
                 System.out.println("Ingrese el radio de su Zona Esferica : ");
                 double Rad6 = xd.nextDouble();   
                 System.out.println("Ingrese la altura de su Zona Esferica : ");
                 double alt6 = xd.nextDouble();   
                 System.out.println("Ingrese el radio mayor de su Zona Esferica : ");
                 double RadMyr6 = xd.nextDouble();   
                 double area = (2*Math.PI*RadMyr6*alt6);
                 double volumen = ((Math.PI*alt6*(Math.pow(alt6,2)+3*Math.pow(Rad6,2)+3*Math.pow(RadMyr6, 2)))/6);
                 System.out.println("El Area de su Zona Esferica es : " + area);
                 System.out.println("El Volumen de su Zona Esferica es : " + volumen);
                  break;

                case 7:
                 System.out.println("........BIENVENIDO A SU CALCULADOR TRONCO DE CONO........");
                 System.out.println("Ingrese la altura de su Tronco de Cono : ");
                 double alt7 = xd.nextDouble(); 
                 System.out.println("Ingrese el radio menor de su Tronco de Cono : ");
                 double RadMen7 = xd.nextDouble();
                 System.out.println(" Ingrese el Radio mayor de su Tronco de Cono : ");
                 double RadMay7 = xd.nextDouble();
                 double Gen7 = (Math.sqrt(Math.pow(alt7,2)+(Math.pow(RadMay7-RadMen7,2))));
                 double ArBasM7 = (Math.PI*Math.pow(RadMay7, 2));
                 double ArBaseMenr7 = (Math.PI*Math.pow(RadMen7, 2));
                 double ArLat7 = (Math.PI*Gen7*(RadMay7+RadMen7));
                 double ArTot7 = (ArLat7+(ArBasM7+ArBaseMenr7));
                 double V7 = ((1/3)*Math.PI*alt7*(Math.pow(RadMay7,2)+Math.pow(RadMen7,2)+(RadMay7*RadMen7)));
                 System.out.println("El Area Lateral de su Tronco de Cono es : " + ArLat7);
                 System.out.println("El Area Total de su Tronco de Cono es : " + ArTot7);
                 System.out.println("El Volumen de su Tronco de Cono es : " + V7);
                   break;

                case 8:
                 System.out.println("........BIENVENIDO A SU CALCULADOR TRONCO DE PIRAMIDE........");
                 System.out.println("Ingrese la longitd del lado mayor de su Tronco de Piramide : ");
                 double LongMyr = xd.nextDouble();  
                 System.out.println("Ingrese la longitud del lado menor de su Tronco de Piramide : ");
                 double LongMnr = xd.nextDouble();  
                 System.out.println("Ingrese la altura de su Tronco de Piramide : ");
                 double alt8 = xd.nextDouble();   
                 double LongMyrMitd8 = (LongMyr/2);
                 double ApPi8 = Math.sqrt(Math.pow(alt8,2)+Math.pow(LongMyrMitd8,2));
                 double ArBas8 = Math.pow(LongMyr,2);
                 double Arbas8 = Math.pow(LongMnr,2);
                 double PerBase8 = (LongMyr*4);
                 double Perbase8 = (LongMnr*4);
                 double ArLat8 = (((PerBase8+Perbase8)/2)*ApPi8);
                 double ArTot8 = ((ArLat8+ArBas8)+ArBas8);
                 double V8 = ((1/3)*alt8*(ArBas8+ArBas8+Math.sqrt(ArBas8*ArBas8)));    
                 System.out.println("El Area Lateral de su Tronco de Piramide es : " + ArLat8);
                 System.out.println("El Area Total de su Tronco de Piramide es : " + ArTot8);
                 System.out.println("El Volumen de su Tronco de Piramide es : " + V8);
                 break;

                case 9:
                 System.out.println("........BIENVENIDO A SU CALCULADOR ORTOEDRO........");
                 System.out.println("Ingrese la altura de su Ortoedro : ");
                 double alt9 =  xd.nextDouble();
                 System.out.println("Ingrese la base de su Ortoedro : ");
                 double bas9 = xd.nextDouble(); 
                 System.out.println("Ingrese la arista de su Ortoedro : ");
                 double Aris9 = xd.nextDouble();
                 double Ar9 = 2 * (Aris9*bas9+Aris9*alt9+bas9*alt9);
                 double Diag9 = Math.sqrt(Math.pow(Aris9,2)+Math.pow(bas9,2)+Math.pow(alt9,2));
                 double V9 = Aris9 * bas9 * alt9;
                 System.out.println("El Area de su Ortoedro es : " + Ar9);
                 System.out.println("La Diagonal de su Ortoedro es : " + Diag9);
                 System.out.println("El Volumen de su Ortoedro es : " + V9);
                break;

                case 10:
                 System.out.println("........BIENVENIDO A SU CALCULADOR TETRAEDRO........");
                 System.out.println("Ingrese la arista de su Tetraedro : ");
                 double Ar10 = xd.nextDouble();  
                 double Are = Math.pow(Ar10,3)*Math.sqrt(3) ;
                 double V10 = ((Math.sqrt(2)/12)*Ar10);
                 double alt10 = (Ar10*(Math.sqrt(6)/3));
                 System.out.println("El Area de su Tetraedro es : " + Are);
                 System.out.println("El Volumen de su Tetraedro es : " + V10);
                 System.out.println("El Altura de su Tetraedro es : " + alt10);
                 break;

                case 11:
                 System.out.println("........BIENVENIDO A SU CALCULADOR HEXAEDRO........");
                 System.out.println("Ingrese la arista de su Hexaedro : ");
                 double Aris11 = xd.nextDouble();    
                 double Ar11 = (6*Math.pow(Aris11,2));
                 double Dig11 = (Aris11*Math.sqrt(3));
                 double V11 = Math.pow(Aris11, 3); 
                 System.out.println("El Area de su Hexaedro es : " + Ar11);
                 System.out.println("La Diagonal de su Hexaedro es : " + Dig11);
                 System.out.println("El Volumen de su Hexaedro es : " + V11);
                 break;

                case 12:
                 System.out.println("........BIENVENIDO A SU CALCULADOR OCTAEDRO........");
                 System.out.println("Ingrese la arista de su Octaedro : ");
                 double Aris12 = xd.nextDouble(); 
                 double Ar12 = (2*Math.pow(Aris12,2)*Math.sqrt(3));
                 double V12 = (Math.sqrt(2)/3)*Math.pow(Aris12,3); 
                 System.out.println("El Area de su Octaedro es : " + Ar12);
                 System.out.println("El Volumen de su Octaedro es : " + V12);
                 break;

                case 13:
                 System.out.println("........BIENVENIDO A SU CALCULADOR DODECAEDRO........");
                 System.out.println("Ingrese la arista de su Dodecaedro : ");
                 double Aris13 = xd.nextDouble();
                 double Ar13 = (3*Math.pow(Aris13,2)*Math.sqrt(25+10+Math.sqrt(5)));
                 double V13 = (1/4) * (15 + 7 * Math.sqrt(5))*Math.pow(Aris13,3);
                 System.out.println("El Area de su Dodecaedro es : " + Ar13);
                 System.out.println("El Volumen de su Dodecaedro es : " + V13);
                 break;

                case 14:
                 System.out.println("........BIENVENIDO A SU CALCULADOR ICOSAEDRO........");
                 System.out.println("Ingrese la arista de su Icosaedro : ");
                 double Aris14 = xd.nextDouble();  
                 double Ar14 = 5 * Math.pow(Aris14, 2) * Math.sqrt(3);
                 double V14 = (5/12) * (3 + Math.sqrt(5)) * Math.pow(Aris14, 3);  
                 System.out.println("El Area de su Icosaedro es : " + Ar14);
                 System.out.println("El Volumen de su Icosaedro es : " + V14);
                 break;

                case 15:
                 System.out.println("........BIENVENIDO A SU CALCULADOR HUSO ESFERICO Y CUÑA ESFERICA........");
                 System.out.println("Ingrese el radio de su Huso Esferico y Cuña Esferica : ");
                 double Rad15 = xd.nextDouble();
                 System.out.println("Ingrese el numero de grados de su Huso Esferico y Cuña Esferica : ");
                 double NrGrd15 = xd.nextDouble();
                 double Ar15 = ((4*Math.PI*Math.pow(Rad15,2)*NrGrd15)/360);
                 double V15 = (((4/3)*4*Math.pow(Math.PI, 3)*NrGrd15)/360); 
                 System.out.println("El Area de su Huso Esferico y Cuña Esferica es : " + Ar15);
                 System.out.println("El Volumen de su Huso Esferico y Cuña Esferica es : " + V15);
                 break;

                case 16:
                 System.out.println("........BIENVENIDO A SU CALCULADOR CASQUETE ESFERICO........");
                 System.out.println("Ingrese la altura de su Casquete Esferico : ");
                 double alt16 = xd.nextDouble();
                 System.out.println("Ingrese el radio mayor de su Casquete Esferico : ");
                 double RadMay16 = xd.nextDouble();
                 double Ar16 = (2*Math.PI*RadMay16*alt16);
                 double V16 = ((Math.PI*Math.pow(alt16,2)*(3*RadMay16-alt16))/6);
                 System.out.println("El Area de su Casquete Esferico es : " + Ar16);
                 System.out.println("El Volumen de su Casquete Esferico es : " + V16);
                 break;

                case 17:
                    if(Contador == 17)
                    {
                        System.out.println("....SALIENDO DEL PROGRAMA....");
                        System.exit(0);
                        xd.close();
                    }
                    break;
            }//switch
        }
    }//metodo main
}//clase
