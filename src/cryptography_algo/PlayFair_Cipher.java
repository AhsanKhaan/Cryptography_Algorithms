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
public class PlayFair_Cipher implements Cryptography_algo {

    private String keyword;
    private static int index;
    private ArrayList<ArrayList<String>> matrix;

    PlayFair_Cipher() {
        index = 0;
        this.keyword = "MONARCHY";
        this.matrix = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            this.matrix.add(new ArrayList<>());
        }
        this.setList();
    }

    private void setList() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (((i == 0) || (i > 0)) && (this.keyword.length() > index)) {
                    if (this.matrix.get(i).contains(this.keyword.charAt(index))) {
                        if (index < this.keyword.length()) {
                            index++;
                            this.matrix.get(i).add("" + keyword.charAt(index));

                        }
                    } else {
                        if (index < this.keyword.length()) {
                            this.matrix.get(i).add("" + keyword.charAt(index));
                        }
                    }
                    //for inresing index
                    if (this.keyword.length() > index) {
                        index++;
                    } else {
                        index = 0;
                    }

                } else {
                    //for adding abcd
                    //series of characters
                    char temp_char = 'A';
                    int temp_int = (int) temp_char;
                    for (temp_int = 65; temp_int < 91; temp_int++) {

                        //for checking not to duplicate keyword loop
                        System.out.println("char"+(char)temp_int);
                        if (this.CheckKeywordChar((char) temp_int)) {

                            

                        } else {
                            if ((char) temp_int == 'I') {
                                if (j < 5) {
                                    
                                } else if (j == 5) {
                                    i++;
                                    j=0;
                                }
                                this.matrix.get(i).add("I/J");
                                j++;
                                temp_int++;
                            } else {
                                if (j < 5) {
                                  
                                } else if (j ==5) {
                                    i++;
                                    j=0;
                                }
                                
                                this.matrix.get(i).add("" + (char) temp_int);
                                j++;
                            }
                        }

                    }
                    
                    break;
                }

            }//end row
        }//end column
    }

    @Override
    public String Encryption(String txt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Decryption(String txt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean CheckKeywordChar(char ch) {
        for (int i = 0; i < this.keyword.length(); i++) {
            if (this.keyword.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

}
