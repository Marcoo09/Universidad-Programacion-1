package concurso;

import java.util.*;
import java.io.*;

public class Concurso {

    public static void main(java.lang.String[] args)
            throws IOException, FileNotFoundException, ClassCastException {
        // Ejemplo de lectura de archivo de Texto
        // La primera linea contiene cantidad de frases a procesar
        // Luego vienen esas lineas, cada linea contiene una frase
        // Se grabara cada palabra en el archivo de salida
        // carga de datos
        FileReader fr = new FileReader("C:\\Users\\Usuario\\Desktop\\ejemplo.txt");
        BufferedReader br = new BufferedReader(fr);
        // salida
        FileWriter wr = new FileWriter("C:\\Users\\Usuario\\Desktop\\ejemploresultado.txt");
        BufferedWriter bwr = new BufferedWriter(wr);
        PrintWriter pp = new PrintWriter(bwr);
        // la primera linea es la cantidad de casos
        String lineaEntera;
        lineaEntera = br.readLine();
        StringTokenizer linea = new StringTokenizer(lineaEntera);
        int cant = Integer.parseInt(linea.nextToken());
        for (int i = 0; i < cant; i++) {
            // leo cada linea
            lineaEntera = br.readLine();
            linea = new StringTokenizer(lineaEntera);
            // proceso cada palabra de la linea
            while (linea.hasMoreTokens()) {
                String pal = linea.nextToken();
                // grabo el resultado
                pp.println("Linea " + (i + 1) + " palabra " + pal);
            }
        }
        pp.close();
    }
}
