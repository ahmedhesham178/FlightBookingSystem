/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking;
import java.util.ArrayList;
/**
 *
 * @author HadyHesham
 */
public class Customer extends User {
   private ArrayList<Booking> bookings;
   
   public Customer(String userId, String username, String password, String name, String email, String contactInfo) {
        super(userId, username, password, name, email, contactInfo);
        this.bookings = new ArrayList<>();
    }
     public void searchFlights(String source, String destination){
         System.out.println("Searching for flights from \" + source + \" to \" + destination + \"...\"");
     } 
     
}
