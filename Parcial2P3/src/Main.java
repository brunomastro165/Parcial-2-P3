import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ponemos acá la matriz para testear
    enviarMatriz(Matrices.matriz4);

    }

    public static void enviarMatriz(String[][] matriz){
        Matrices.mostrarMatriz(matriz, 6, 6);
        if (Matrices.analizarMatriz(matriz, 6, 6)){
            System.out.println("La matriz presentada es mutante");
        }
        else{
            System.out.println("La matriz presentada no es mutante");
        }
    }

    /*
    public static void llenarMatriz(String[][]matriz, Integer n, Integer n2, Scanner in){
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
               // Integer s = rand.nextInt(9)+1;

                Integer s = in.nextInt();
                matriz[i][j] = s.toString();
            }
        }
    }
     */


}
