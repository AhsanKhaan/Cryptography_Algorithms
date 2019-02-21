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
public class Vigenere_Cipher implements Cryptography_algo {

    private final String key;
    private final ArrayList<node> list;
    

    Vigenere_Cipher() {
        this.key = "mak";
        this.list = new ArrayList<>();
        InitList();
    }



    @Override
    public String Encryption(String txt) {
        String temp = "";

        int txt_int, key_int, temp_index = 0, temp_int;
        String text = txt.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (this.getIntFromchar(text.charAt(i)) == -1) {
                temp += '$';
            } else {
                txt_int = this.getIntFromchar(text.charAt(i));
                key_int = this.getIntFromchar(this.key.charAt(temp_index));
                temp_int = txt_int + key_int;
                if (temp_int > 25) {
                    temp_int = temp_int - 26;
                } else {
                    temp_int = temp_int + 0;
                }
                if (this.getCharFromInt(temp_int) == ' ') {
                    temp += '*';
                } else {
                temp += this.getCharFromInt(temp_int);
                }
                
            }

            //setting index at end
            if (temp_index < key.length() - 1) {

                temp_index++;

            } else {
                temp_index = 0;
            }
        }

        return temp;
    }

    @Override
    public String Decryption(String txt) {
        String temp = "";
        char txt_ch, key_ch;
        int txt_int, key_int, temp_index = 0, temp_int;

        String text = txt.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (this.getIntFromchar(text.charAt(i)) == -1) {
                temp += ' ';
            } else {
                txt_int = this.getIntFromchar(text.charAt(i));
                key_int = this.getIntFromchar(this.key.charAt(temp_index));
                if(txt_int<key_int){
                txt_int+=26;
                }
                temp_int = txt_int - key_int;
                if (temp_int > 25) {
                    temp_int = temp_int - 26;
                } else {
                    temp_int = temp_int + 0;
                }
                if (this.getCharFromInt(temp_int) == ' ') {
                    temp += '*';
                } else {
                    temp += this.getCharFromInt(temp_int);
                }

            }

            //setting index at end
            if (temp_index < key.length() - 1) {

                temp_index++;

            } else {
                temp_index = 0;
            }
        }
        return temp;
    }

    private void InitList() {
        char temp_ch = 'a';
        int temp_int = 0;
        for (int i = 0; i < 26; i++) {
            temp_int = i + (int) temp_ch;
            temp_ch = (char) temp_int;
            this.list.add(new node(i, temp_ch));

            temp_ch = 'a';
        }

    }

    private int getIntFromchar(char ch) {

        for (int i = 0; i < this.list.size(); i++) {
            if (ch == this.list.get(i).getCharacter()) {
                return this.list.get(i).getInteger();
            }
        }
        return -1;
    }

    private char getCharFromInt(int integer) {
        for (int i = 0; i < this.list.size(); i++) {
            if (integer == this.list.get(i).getInteger()) {
                return this.list.get(i).getCharacter();
            }
        }
        return ' ';
    }

};
