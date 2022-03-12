package com.company;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.File;
public class Main {

    public static void main(String[] args) {
        File file = new File("plik.txt");
        int length = (int) file.length();
       try(
               FileInputStream inputStream = new FileInputStream(file);
               InputStreamReader fileReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

               ) {
           char[] data = new char[length];
               int readBytes = fileReader.read(data, 0, data.length);
               if(readBytes == -1) {
                   throw new IOException("File reading error (expected " + length + " bytes).");
               }
               String text = new String(data, 0, readBytes);
               System.out.print(text);

       } catch (IOException e) {
           e.printStackTrace();
       }

    };
}
