package modulos;

import java.util.Random;
import java.util.Scanner;

public class ExamenEDRefactorizado {

    static int maxArray = 30;

    public static void main(String args[]){

        System.out.println("Introduce la cantidad de números aleatorios del Array: ");
        Scanner input = new Scanner(System.in);
        int maxNumeros = input.nextInt();
        Random random = new Random();
        int []a = new int[maxNumeros];
        for(int in=0; in<maxNumeros; in++)
        {
            a[in] = random.nextInt(ExamenEDRefactorizado.maxArray);
        }

        ExamenEDRefactorizado.calculaMayorYMenor(a);
        input.close();
    }


    public static void calculaMayorYMenor(int[] a){

        int mayor = 0;
        int menor = ExamenEDRefactorizado.maxArray;

        for(int in=0; in<a.length; in++)
        {
            System.out.println(a[in]);
            if(a[in] > mayor ){
                mayor = a[in];
            }

            if(a[in] < menor){
                menor = a[in];
            }
        }

        int producto = menor *mayor;
        if (producto == 0 || (producto % 2 != 0)  ){
            System.out.println("El número resultante NO ES primo.");
        }else{
            System.out.println("El número resultante SI ES primo.");
        }
    }
}
