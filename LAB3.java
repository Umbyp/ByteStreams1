/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestreams;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataIntputStream intput = new DataIntputStream(file);
            System.out.println(intput.readUTF());
            System.out.println(intput.readInt());
            System.out.println(intput.readDouble());
            System.out.println(intput.readChar());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
