package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    //ZADANIE 1 i 2

    public static void main(String[] args) throws IOException {
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

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String tekst = reader.readLine();

        try (

            FileOutputStream stream = new FileOutputStream(("plik.txt"));
            OutputStreamWriter writer = new OutputStreamWriter(stream, StandardCharsets.UTF_8);
        ) {
            writer.write(tekst);
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    };
}
