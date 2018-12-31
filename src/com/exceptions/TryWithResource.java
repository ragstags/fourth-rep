package com.exceptions;

import java.io.*;

/**
 * Created by nadimchouglay on 25/12/2018.
 */
public class TryWithResource {
    public static void main(String[] args) {
        File file = new File("myfile.txt");

        try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);){
            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch(FileNotFoundException e ){
            System.out.println("file not found");
        }catch (IOException e){
            System.out.println("problem reading the file "+file.getName());
        }

        }
    }

