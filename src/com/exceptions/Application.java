package com.exceptions;

import java.io.*;

/**
 * Created by nadimchouglay on 22/12/2018.
 */
public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("myfile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
                System.out.println(line);
            }


        } catch (java.io.IOException e) {
            System.out.println("file not found");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();


            }

        }
    }
}
