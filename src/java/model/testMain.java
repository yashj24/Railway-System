/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import DAO.passengerDAO;
import java.util.LinkedList;


public class testMain {
    public static void main(String[] args) {
        Passenger p= new Passenger();
        p.setFirstName("abc");
        p.setLastName("Jain");
        p.setGender("Male");
        p.setAge(19);
        p.setMobile(9753961898d);
        p.setEmail("yasd45@gmail.com");
        p.setBookingID(53612);
        p.setAddress("kjsackb");
        
        String pass="Hello";   
        
        passengerDAO pd= new passengerDAO();
        
        if(pd.signUp(p, pass)){
            System.out.println("done");
        }else{
            System.out.println("not");
        }
      
      
      
           
        
        
    }
   
}
