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
PlayFair_Cipher pfc=new PlayFair_Cipher();
//    pc.printTable();
    String enc, dec, txt;
        
//        while (true) {
//            System.out.print("Enter the text you want to encrypt:");
//            txt = new Scanner(System.in).nextLine();
//            if (txt.equals("")) {
//                break;
//            } 
            enc = pfc.Encryption("MeetMeAtTheSchoolHouse");
            System.out.println(enc);

         //   dec = pc.Decryption(enc);
            System.out.print("Your text:");
//            System.out.println(txt);
            System.out.print("Encrypted Text:");
            System.out.println(enc);
            System.out.print("Decrypted Text:");
        //    System.out.println(dec);
            System.out.println("Note:Press Enter to exit");
//        }
//ArrayList<Character> sequence = new ArrayList<>();
//for (char c = 'A' ; c <= 'Z' ; c++) {
//    sequence.add(c);
//}
//Collections.shuffle(sequence);
//for (Character c : sequence) {
//    System.out.println(c);
//}
    }

    public String Encryption(String txt);

    public String Decryption(String txt);
}
