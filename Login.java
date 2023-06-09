/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package St10083153_Register;

/**
 *
 * @author lab_services_student
 */
public class Login {
    private String Username;
    private String First_Name;
    private String Last_Name;
    private String Password;
   public boolean checkUserName(String username){
       if(username == null || username.isEmpty() || username.length() > 5 || !username.contains("_")){
           return false;
       }
       return true;
   }
   
   
   public boolean checkPasswordComplexity(String password){
       if(password==null || password.length() < 8){
           return false;
       }
       boolean ContainsNumber = false;
       boolean ContainsSpecialCharacter = false;
       boolean ContainsUpperCase = false;
       
       for(char c: password.toCharArray()){
           if(Character.isDigit(c)){
               ContainsNumber = true;
           }
           
           else if(Character.isLetterOrDigit(c)){
               ContainsSpecialCharacter = true;
           }
           
           else if(Character.isUpperCase(c)){
               ContainsUpperCase = true;
           }
           
       }
       return ContainsNumber && ContainsSpecialCharacter && ContainsUpperCase;
   }
   
   public String registerUser(String FirstName, String LastName, String username, String password){
       boolean usernameValidity = checkUserName(username);
       boolean passwordValidity = checkPasswordComplexity(password);
       
       if(!usernameValidity && !passwordValidity){
           return"Usename and password incorrectly formatted";
       }
       else if(!usernameValidity){
           return "Username incorrectly formatted";
       }
       else if(!passwordValidity){
           return" PAssword incorrectly formatted";
       }
       else {
           return "User registration successful";
       }
   }
   
   
   public Boolean loginUser(String username, String password){
       if(username.equals(Username) && password.equals(Password)){
       System.out.println("Welcome " + First_Name + " "+Last_Name+", it is great to see you.");
       return true;
       }
       else{
           System.out.println("Username pr password are incorrect. try again");
           return false;
       }
   }
   
   public Login(String FirstName, String LastName,String username, String password){
       this.First_Name = FirstName;
       this.Last_Name = LastName;
       this.Password = password;
       this.Username = username;
   }
   
   

}
