/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking;

/**
 *
 * @author HadyHesham
 */
public abstract class User {
     protected String userId;
     protected String username;
     protected String password;
     protected String email;
     protected String name;
     protected String contactInfo; 
     
      public User(String userId, String username, String password, String name, String email, String contactInfo) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.contactInfo = contactInfo;
    }
     public User login(String inputUsername, String inputPassword) {
        this.setUsername(inputUsername);
        this.password = inputPassword;
        
        return this;
    }
     public void logout(){
         System.out.println("logged out sucessfully ");
         
     }
     public void updateProfile(String name, String email, String contactInfo) {
        this.name = name;
        this.email = email;
        this.contactInfo = contactInfo;
     }
     public String getuserId(){
         return userId;
     }
     public void setUserId(String userId) {
        if (userId != null && !userId.isEmpty()) {
            this.userId = userId;           
        }
        else{
            System.out.println("userId cannot be empty!");
        }
    }
       public String getUsername() {
        return username;
    }
       public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        }
        else{
            System.out.println("username cannot be empty!");
        }
    }
       public String getPassword() {
        return password;
    }
       public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        }
        else{
            System.out.println("password cannot be empty!");
        }
    }
       public String getName() {
        return name;
    }
         public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        else{
            System.out.println("name cannot be empty!");
        }
    }
         public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
        else{
            System.out.println("email cannot be empty and must contains @");
        }
    }
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        if (contactInfo != null && !contactInfo.isEmpty()) {
            this.contactInfo = contactInfo;
        }
        else{
            System.out.println("conactInfo cannot be empty!");
        }
    }
}
