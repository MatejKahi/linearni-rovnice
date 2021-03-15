package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./functions.txt"));
            ArrayList<String> readfile = new ArrayList<>();
            String readnow = reader.readLine();
            while (readnow != null){
                readfile.add(readnow);
                readnow = reader.readLine();
            }
            reader.close();
            for (int i = 0; i < readfile.size(); i++) {
                System.out.println(readfile.get(i));
            }
            //
            for (int i = 0; i < readfile.size(); i++) {
                String funkceted = readfile.get(i);
                for (int j = 0; j < funkceted.length(); j++) {
                    char now = funkceted.charAt(j);
                    if (now == 'x') {
                        String pridat = "";
                        char g = funkceted.charAt(j - 1);
                        int pocitat = 1;
                        while (g != ' '){
                            pocitat ++;
                            pridat += g;
                            g = funkceted.charAt(j - pocitat);
                        }
                        data.a = Integer.parseInt(pridat);
                    }
                }
            }
            for (int i = 0; i < readfile.size(); i++) {
                String funkceted = readfile.get(i);
                for (int j = 0; j < funkceted.length(); j++) {
                    char now = funkceted.charAt(j);
                    if (now == 'x') {
                        String pridat = "";
                        char g = funkceted.charAt(j - 1);
                        int pocitat = 1;
                        while (g != ' '){
                            pocitat ++;
                            pridat += g;
                            g = funkceted.charAt(j - pocitat);
                        }
                        data.b = Integer.parseInt(pridat);
                    }
                }
                System.out.println("A = " + data.a + "| B = " + data.b);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
