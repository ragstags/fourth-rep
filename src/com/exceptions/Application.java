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
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();

            }
        }catch (FileNotFoundException e) {
            System.out.println("file not found");

        } catch (IOException e) {
            System.out.println("Problem reading file "+file.getName());;
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("unable to close the file "+file.getName());
            }
        }
    }
}