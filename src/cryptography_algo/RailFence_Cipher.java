/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography_algo;

import java.util.ArrayList;


/**
 *
 * @author Ahsan Khan
 */
public class RailFence_Cipher implements Cryptography_algo {
    private final ArrayList<Character> q1;
    private final ArrayList<Character> q2;
    RailFence_Cipher(){
    q1=new ArrayList<>();
    q2=new ArrayList<>();
    }
    @Override
    public String Encryption(String txt) {
         txt = txt.toUpperCase();
         String temp="";
         if (txt.length()%2==0) {
            
        }else{
         txt+="X";
         }
         for (int i = 0; i < txt.length(); i++) {
             q1.add(txt.charAt(i));
             i++;
             q2.add(txt.charAt(i));
        }
         for (int i = 0; i < q1.size(); i++) {
            temp+=q1.get(i);
        }
         for (int i = 0; i < q2.size(); i++) {
            temp+=q2.get(i);
        }

     return temp;}

    @Override
    public String Decryption(String txt) {
      txt=txt.toUpperCase();
      q1.clear();
      q2.clear();
    String temp="";
        for (int i = 0; i < txt.length()/2; i++) {
            q1.add(txt.charAt(i));
           }
        for (int i = txt.length()/2; i <txt.length() ; i++) {
            q2.add(txt.charAt(i));
        }
        for (int i = 0; i < q1.size(); i++) {
            temp+=q1.get(i).toString()+q2.get(i).toString();
        }
      
    return temp;}
    
};
