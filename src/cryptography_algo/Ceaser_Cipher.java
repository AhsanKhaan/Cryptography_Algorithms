/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography_algo;

/**
 *
 * @author Ahsan Khan
 */
public class Ceaser_Cipher implements Cryptography_algo{
   int weight;

    Ceaser_Cipher(int t) {
        this.weight = t;
    }

   @Override
    public String Encryption(String txt) {
        String temp = "";
        int temp_int;
        char temp_char;
        for (int i = 0; i < txt.length(); i++) {
            //temp+=txt.charAt(i)+this.weight;
            temp_int = this.weight + (int) txt.charAt(i);
            temp_char = (char) temp_int;
            temp += temp_char;

        }
        return temp;
    }

   @Override
    public String Decryption(String txt) {
        String temp = "";
        for (int i = 0; i < txt.length(); i++) {
            int temp_int =  (int) txt.charAt(i)-this.weight;
            char temp_char = (char) temp_int;
            temp += temp_char;


        }
        return temp;
    }
}
   

