package org.example;

public class Main {
    public static void main(String[] args) {
        final int A = 5;
        final int B = 10;
        BinOps bins = new BinOps();
        String strA = bins.toBin(A);
        String strB = bins.toBin(B);
        String sum = bins.sum(strA, strB);
        String mult = bins.mult(strA, strB);
        System.out.println("First argument:\n" + strA);
        System.out.println("Second argument:\n" + strB);
        System.out.println("Sum in binary:\n" + sum);
        System.out.println("Sum in decimal:\n" + bins.toDec(sum));
        System.out.println("Mult in binary:\n" + mult);
        System.out.println("Mult in decimal:\n" + bins.toDec(mult));
    }
}