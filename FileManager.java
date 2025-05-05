/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HadyHesham
 */
public class FileManager {
    
    String userspath;
    String bookingpath;
    String flightpath;
    String passengerpath;
    
public void readfile(String filepath){
                System.out.println("\nReading with line numbers:");
                try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
                    String line;
                    int lineNumber = 1;
                    while ((line = br.readLine()) != null) {
                        
                        // logic for finding a user
                    }
                }catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage()
                
                );
           


}
}

public void writetofile(String filepath, String data){
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            writer.write(data);
        } catch (IOException ex) {
        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}

    public void saveusers(String username, String pass, int role){
    // concatenate the attroibutes
    String account = username + " " + pass + " " + role;
    writetofile(userspath, account);
    
    }
                
}
