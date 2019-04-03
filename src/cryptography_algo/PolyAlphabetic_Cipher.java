/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography_algo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ahsan Khan
 */
public class PolyAlphabetic_Cipher implements Cryptography_algo {

    private final ArrayList<ArrayList<Character>> alphabet_chart;

    PolyAlphabetic_Cipher() {
        this.alphabet_chart = new ArrayList<>();
        InitList();

    }

    private void InitList() {
        //loop for making 4 rows
        for (int i = 0; i < 4; i++) {
            this.alphabet_chart.add(new ArrayList<>());
        }
        //Adding character at row 0
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            this.alphabet_chart.get(0).add(ch);
        }
        //temperary list used for shuffling
        ArrayList<Character> temp = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            temp.add(ch);
        }

        //shuffle characters at row1 as M1
        Collections.shuffle(temp);
        for (Character c : temp) {
            this.alphabet_chart.get(1).add(c);
        }
        //shuffle characters at row2 as M2
        Collections.shuffle(temp);
        for (Character c : temp) {
            this.alphabet_chart.get(2).add(c);
        }

        //shuffle characters at row3 as M3
        Collections.shuffle(temp);
        for (Character c : temp) {
            this.alphabet_chart.get(3).add(c);
        }

    }

    @Override
    public String Encryption(String txt) {
        String temp = "";
        txt = txt.toUpperCase();
        int temp_index = 1, ch_index;
        for (int i = 0; i < txt.length(); i++) {
            if (this.alphabet_chart.get(0).contains(txt.charAt(i))) {
                if (this.getIndex(txt.charAt(i),0) == -1) {
                    temp += '&';
                } else {
                    ch_index = this.getIndex(txt.charAt(i),0);
                    temp += this.alphabet_chart.get(temp_index).get(ch_index);
                }
            } else {
                temp += ' ';
            }
            if (temp_index < this.alphabet_chart.size() - 1) {

                temp_index++;

            } else {
                temp_index = 1;
            }
        }

        return temp;
    }

    @Override
    public String Decryption(String txt) {
        String temp = "";
        txt = txt.toUpperCase();
        int temp_index = 1, ch_index;
        for (int i = 0; i < txt.length(); i++) {
            if (this.alphabet_chart.get(0).contains(txt.charAt(i))) {
                if (this.getIndex(txt.charAt(i),temp_index) == -1) {
                    temp += '&';
                } else {
                    ch_index = this.getIndex(txt.charAt(i),temp_index);
                    temp += this.alphabet_chart.get(0).get(ch_index);
                }
            } else {
                temp += ' ';
            }
            if (temp_index < this.alphabet_chart.size() - 1) {

                temp_index++;

            } else {
                temp_index = 1;
            }
        }

        return temp;
    }

    public void printTable() {
        for (int i = 0; i < this.alphabet_chart.size(); i++) {

            System.out.print(this.alphabet_chart.get(i) + "\t");

            System.out.println();
        }
    }

    private int getIndex(char ch,int list_index) {
        for (int i = 0; i < this.alphabet_chart.get(list_index).size(); i++) {
            if (this.alphabet_chart.get(list_index).get(i) == ch) {
                return i;
            }
        }

        return -1;
    }

};
