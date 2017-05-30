/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfile;

/**
 *
 * @author Brett
 */
import java.io.*;
import java.util.Scanner;

public class MyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String choice;
        Scanner input = new Scanner(System.in);

        File textFile = new File("D:\\NetBeans Projects\\MyFile\\zzz.txt");
        try {
            textFile.createNewFile();
            System.out.println("The file, 'zzz.txt' has been created");
        } catch (IOException e) {
            System.out.println("File could not be created");
            System.err.println("IOException: " + e.getMessage());
        }
        

        System.out.println("Delete the file? (type 'delete' to delete)");
        choice = input.next();

        if (choice.equals("delete")) {        
                if (textFile.delete()) {
                    System.out.println("File successfully deleted");
                }
            
        }
    }

}
