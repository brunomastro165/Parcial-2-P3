import java.util.ArrayList;

public class Matrices {
    public static String[][] matriz = {
            {"A", "A", "A", "A", "A", "A"},
            {"A", "A", "G", "T", "G", "C"},
            {"A", "T", "A", "T", "G", "T"},
            {"A", "G", "A", "A", "G", "G"},
            {"A", "C", "C", "C", "T", "A"},
            {"T", "C", "A", "C", "G", "T"},
    };

    public static String[][] matriz1 = {
            {"A", "B", "C", "D", "G", "T"},
            {"A", "G", "T", "A", "C", "G"},
            {"C", "A", "G", "T", "A", "C"},
            {"T", "C", "A", "G", "T", "A"},
            {"G", "T", "C", "A", "G", "T"},
            {"A", "C", "G", "T", "C", "A"}
    };

    public static String[][] matriz2 = {
            {"T", "A", "C", "G", "T", "A"},
            {"G", "T", "A", "C", "G", "T"},
            {"A", "G", "T", "A", "C", "G"},
            {"C", "A", "G", "T", "A", "C"},
            {"T", "C", "A", "G", "T", "A"},
            {"G", "T", "C", "A", "G", "T"}
    };

    public static String[][] matriz3 = {
            {"A", "C", "G", "A", "C", "A"},
            {"T", "A", "C", "A", "A", "A"},
            {"G", "T", "A", "A", "G", "T"},
            {"A", "G", "A", "A", "C", "G"},
            {"C", "A", "G", "A", "A", "C"},
            {"T", "C", "A", "G", "T", "A"}
    };

    public static String[][] matriz4 = {
            {"C", "G", "T", "A", "C", "G"},
            {"A", "C", "G", "T", "C", "A"},
            {"T", "A", "C", "G", "T", "A"},
            {"G", "T", "A", "C", "G", "T"},
            {"A", "G", "T", "A", "C", "G"},
            {"C", "A", "G", "T", "A", "C"}
    };

    public static String[][] matriz5 = {
            {"A", "B", "C", "D", "E", "F"},
            {"G", "H", "I", "J", "K", "L"},
            {"M", "N", "O", "P", "Q", "R"},
            {"S", "T", "U", "V", "W", "X"},
            {"Y", "Z", "a", "b", "c", "d"},
            {"e", "f", "g", "h", "i", "j"}
    };

    public static String[][] matriz6 = {
            {"A", "1", "2", "3", "4", "5"},
            {"A", "A", "6", "7", "8", "9"},
            {"A", "10", "A", "11", "12", "13"},
            {"A", "14", "15", "A", "16", "17"},
            {"A", "18", "19", "20", "A", "21"},
            {"22", "23", "24", "25", "26", "27"}
    };

    public static String[][]matriz7 = {
            {"A", "A", "A", "A", "B", "B"},
            {"4", "3", "2", "1", "W", "B"},
            {"5", "6", "7", "8", "9", "B"},
            {"16", "17", "WW", "GG", "10", "B"},
            {"15", "14", "13", "12", "11", "B"},
            {"AR", "CE", "GW", "TS", "CA", "A"}
    };

    public static String[][] matriz8 = {
            {"X", "A", "3", "4", "5", "A"},
            {"7", "X", "A", "10", "A", "1"},
            {"1", "1", "A", "A", "1", "1"},
            {"9", "2", "A", "A", "A", "2"},
            {"5", "A", "2", "2", "A", "A"},
            {"1", "2", "3", "4", "3", "A"}
    };

    public static String[][] matriz9 = {
            {"A", "C", "G", "T", "C", "A"},
            {"T", "A", "C", "G", "T", "A"},
            {"G", "T", "A", "C", "G", "T"},
            {"A", "G", "T", "A", "C", "G"},
            {"C", "A", "G", "T", "A", "C"},
            {"T", "C", "A", "G", "T", "A"}
    };

    public static String[][] matriz10 = {
            {"C", "G", "T", "A", "C", "G"},
            {"A", "C", "G", "T", "C", "A"},
            {"T", "A", "C", "G", "T", "A"},
            {"G", "T", "A", "C", "G", "T"},
            {"A", "G", "T", "A", "C", "G"},
            {"C", "A", "G", "T", "A", "C"}
    };

    public static String[][] matriz11 = {
            {"A", "B", "C", "D", "E", "F"},
            {"G", "H", "I", "J", "K", "L"},
            {"M", "N", "O", "P", "Q", "R"},
            {"S", "T", "U", "V", "W", "X"},
            {"Y", "Z", "a", "b", "c", "d"},
            {"e", "f", "g", "h", "i", "j"}
    };


    public static void mostrarMatriz(String[][]matriz, Integer n, Integer n2){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static boolean analizarMatriz(String[][]matriz, Integer n, Integer n2){
        String aux = "";
        int cont = 0;
        int enfermedades = 0;
        int contEnfermedades=0;
        boolean flag = false;
        int rows = matriz.length;
        int cols = matriz[0].length;

        // Analizar la matriz horizontalmente

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {

                if (!flag){
                    aux = matriz[i][j];
                    flag = true;
                }

                if (matriz[i][j].equals(aux))
                {
                    cont ++;
                }
                else{
                    aux = matriz[i][j];
                    cont=0;
                }

                if(cont==4){
                    enfermedades++;
                    cont=0;
                }
            }
            flag = false;
            cont=0;
            contEnfermedades+=enfermedades;
            enfermedades = 0;
        }
        aux = "";

        // Analizar la matriz verticalmente

        enfermedades = 0;
        flag = false;
        for (int j = 0; j < n2;j++) {
            for (int i = 0; i < n; i++) {
                if (!flag){
                    aux = matriz[i][j];
                    flag = true;
                }

                if (matriz[i][j].equals(aux))
                {
                    cont ++;
                }

                else{
                    aux = matriz[i][j];
                    cont=0;
                }

                if(cont==4){
                    enfermedades++;
                }
            }
            flag = false;
            cont=0;
            contEnfermedades+=enfermedades;
            enfermedades = 0;
        }
        aux = "";

        // Recorrer todas las diagonales

        for (int k = 0; k <= rows + cols - 2; k++) {
            for (int j = 0; j <= k; j++) {
                int i = k - j;
                if (i < rows && j < cols) {
                    if (matriz[i][j].equals(aux)) {
                        cont++;
                        if (cont == 4) {
                            enfermedades++;
                            cont = 0;  // Reiniciar el contador después de detectar una enfermedad
                        }
                    } else {
                        aux = matriz[i][j];
                        cont = 1;  // Iniciar el contador para el nuevo carácter
                    }
                }
            }
            cont=0;
            contEnfermedades += enfermedades;
            enfermedades = 0;  // Reiniciar el contador de enfermedades después de cada diagonal
        }
        aux = "";

        // Recorrer todas las diagonales inversas

        for (int k = 0; k <= rows + cols - 2; k++) {
            for (int j = 0; j <= k; j++) {
                int i = rows - 1 - (k - j);
                if (i >= 0 && j < cols) {
                    if (matriz[i][j].equals(aux)) {
                        cont++;
                        if (cont == 4) {
                            enfermedades++;
                            cont = 0;  // Reiniciar el contador después de detectar una enfermedad
                        }
                    } else {
                        aux = matriz[i][j];
                        cont = 1;  // Iniciar el contador para el nuevo carácter
                    }
                }
            }
            cont=0;
            contEnfermedades+=enfermedades;
            enfermedades=0;
        }

        System.out.println("Enfermedades: "+contEnfermedades);
        if(contEnfermedades>1){
            return  true;
        }
        else{
            return  false;
        }
    }


}
