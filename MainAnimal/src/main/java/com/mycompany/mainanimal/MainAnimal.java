/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainanimal;

/**
 *
 * @author Admin
 */
public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("SOM SOM ", 5);
        Cachorro cachorro = new Cachorro("Rex", 3);

        animal.emitirSom();
        cachorro.emitirSom();
    }
}

