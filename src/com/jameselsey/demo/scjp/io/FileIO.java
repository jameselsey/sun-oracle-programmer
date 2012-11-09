package com.jameselsey.demo.scjp.io;

import java.io.*;

/**
 * Author:  JElsey
 * Date:    20/10/2012
 */
public class FileIO
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("myFile.dat");
        System.out.println("Checking if file exists : " + f.exists());

        openFileAndWriteToIt(f);
        openFileAndReadIt(f);
    }

    private static void openFileAndReadIt(File f)
    {
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println("reading: " + line);
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public static void openFileAndWriteToIt(File f)
    {
        try{

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            bufferedWriter.write("hello! is now being written to the file");
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Finished writing to file");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
