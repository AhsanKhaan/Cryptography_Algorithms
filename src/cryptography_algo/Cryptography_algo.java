/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography_algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ahsan Khan
 */
public interface Cryptography_algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
RailFence_Cipher rfc=new RailFence_Cipher();
//    pc.printTable();
    String enc, dec, txt;
        
        while (true) {
            System.out.print("Enter the text you want to encrypt:");
            txt = new Scanner(System.in).nextLine();
            if (txt.equals("")) {
                break;
            } 
                txt="MeetMeAtTheSchoolHouse";
                enc = rfc.Encryption(txt);
            
  //          dec=rfc.Decryption(enc);
            
            dec = rfc.Decryption(enc);
            System.out.print("Your text:");
            System.out.println(txt);
            System.out.print("Encrypted Text:");
            System.out.println(enc);
            System.out.print("Decrypted Text:");
              System.out.println(dec);
            System.out.println("Note:Press Enter to exit");
        }

    }

    public String Encryption(String txt);

    public String Decryption(String txt);
}
