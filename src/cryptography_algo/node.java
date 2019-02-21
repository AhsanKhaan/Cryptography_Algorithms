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
class node {

    private int Integer;
    private char character;

    node(int i, char ch) {
        this.Integer = i;
        this.character = ch;
    }

    public int getInteger() {
        return this.Integer;
    }

    public void setInteger(int i) {
        this.Integer = i;
    }

    public char getCharacter() {

        return this.character;
    }

    public void setCharacter(char ch) {
        this.character = ch;
    }
};
