package com.api.serial;

import java.io.*;

//read from console and write into file
public class FileWrite {
    public static void main(String[] args) {

        //create an object for converting bytes to characters
        InputStreamReader iReader = new InputStreamReader(System.in);

        //create an object of Buffer Reader
        BufferedReader bufferedReader = new BufferedReader(iReader);

        FileOutputStream fileOutputStream =null;

        try {
            fileOutputStream = new FileOutputStream("demo.txt");
            char c = (char) bufferedReader.read();
            while (c != 'q') {
                System.out.print(c);
                fileOutputStream.write(c);
                c = (char) bufferedReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            try {
                if(fileOutputStream!=null)
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
