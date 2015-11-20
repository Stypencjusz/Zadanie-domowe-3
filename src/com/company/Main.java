package com.company;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.println("Plik do wczytania");
        String inputFile = console.next();

        File file = new File(inputFile);
        Scanner in = new Scanner(file);


        int slowa = 0;
        int bznaki = 0;
        int znaki= 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ' && line.charAt(i) != '\n' && line.charAt(i) != '\t')
                    znaki++;
                else
                    bznaki++;
            }
            slowa += new StringTokenizer(line, " ,").countTokens();
        }
        in.close();
        System.out.println("Biale znaki = " + bznaki);
        System.out.println("Slowa = " + slowa);
        System.out.println("Znaki = " + znaki);
    }
}