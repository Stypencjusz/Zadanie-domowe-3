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
        int[] tab=new int[3];
        while (in.hasNextLine()) {
            String line = in.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ' && line.charAt(i) != '\n' &&  line.charAt(i) != '\t' && line.charAt(i) != '\r')
                    znaki++;
                else
                    bznaki++;
            }
            slowa += new StringTokenizer(line, " ,").countTokens();
        }
        in.close();
        tab[0]=bznaki;
        tab[1]=slowa;
        tab[2]=znaki;
        System.out.println("Biale znaki = " + tab[0]);
        System.out.println("Slowa = " + tab[1]);
        System.out.println("Znaki = " + tab[2]);
    }
}