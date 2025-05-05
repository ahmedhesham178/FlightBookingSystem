/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author HadyHesham
 */
public class Flight {
     private int flightNumber;
     private String departureTime;
     private String arrivalTime;
     private int availableSeats;
     private String airline;
     private String destination;
     private String origin;
     private double price;
     private Map<String, Double> prices;
     
      public Flight(int flightNumber, String origin, String destination, String departureTime, String arrivalTime, String airline, double price, int availableSeats){
         this.flightNumber = flightNumber;
         this.arrivalTime = arrivalTime;
         this.departureTime = departureTime;
         this.airline = airline;
         this.destination = destination;
         this.availableSeats = availableSeats;
         this.origin = origin;
         this.price = price;
         this.prices = new HashMap<>();
      }
     public boolean checkAvailability() {
        return availableSeats > 0;
    }
      public void updateSchedule(String newDeparture, String newArrival) {
        this.departureTime = newDeparture;
        this.arrivalTime = newArrival;
    }
      public boolean reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }
      //hna fi method na2sa
      
     public int getFlightNumber() {
        return flightNumber;
    }
      public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
      public String getAirline() {
        return airline;
    }
      public void setAirline(String airline) {
          if(airline != null && !airline.isEmpty()){
             this.airline = airline;  
          }
          else{
              System.out.println("airline cannot be empty!");
          }
    }
      public String getOrigin() {
        return origin;
    }
       public void setOrigine(String origin) {
           if(origin != null && !origin.isEmpty()){
               this.origin = origin;
           }
           else{
               System.out.println("origin cannot be empty!");
           }
       }
        public String getDestination() {
        return destination;
    }
        public void setDestination(String destination) {
            if(destination != null && !destination.isEmpty()){
                this.destination = destination;
            }
            else{
                System.out.println("destination cannot be null!");
            }
        }
          public String getDepartureTime() {
        return departureTime;
    }
           public void setDepartureTime(String departureTime){
               if(departureTime != null && departureTime.isEmpty()){
                   this.departureTime = departureTime;
               }
               else{
                   System.out.println("departureTime cannot be empty!");
               }
           }
            public String getArrivalTime() {
        return arrivalTime;
    }
            public void setArrivalTime(String arrivalTime){
                if(arrivalTime != null && !arrivalTime.isEmpty()){
                    this.arrivalTime = arrivalTime;
                }
                else{
                    System.out.println("arrival time cannot be empty!");
                }
            }
             public int getAvailableSeats() {
        return availableSeats;
    }
            public void setAvailableSeats(int availableSeats){
                if(availableSeats < 0){
                    System.out.println("number of seat cannot be negative");
                }
                else{
                    this.availableSeats = availableSeats;
                }
            }
             public Map<String, Double> getPrices() {
        return prices;
    }
             public void setPrice(String seatClass, double price){
                 if(){
                     
                 }
             }
             
             
             
           

}
