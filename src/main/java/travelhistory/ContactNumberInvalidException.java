/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelhistory;

/**
 *
 * @author peter john
 */
public class ContactNumberInvalidException extends RuntimeException {
    
    public ContactNumberInvalidException() {
        super("PHONE NUMBER SHOULD START WITH 09 AND 11 DIGITS");
    }
     
}
