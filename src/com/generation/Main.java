package com.generation;

import com.generation.uber.UberBlack;
import com.generation.uber.UberDriver;

public class Main {

    public static void main(String[] args) {
        UberDriver conductor = new UberDriver();
        System.out.println("Uber driver");
        conductor.calcularPrecio(1);

        UberBlack conductor2 = new UberBlack();
        System.out.println("Uber black driver");
        conductor2.calcularPrecio(1);
    }
}
