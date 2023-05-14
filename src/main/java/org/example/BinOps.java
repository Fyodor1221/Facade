package org.example;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int arg0 = this.toDec(a);
        int arg1 = this.toDec(b);
        return this.toBin(arg0 + arg1);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int arg0 = this.toDec(a);
        int arg1 = this.toDec(b);
        return this.toBin(arg0 * arg1);
    }

    public String toBin(int a) {
        return Integer.toBinaryString(a);
    }

    public int toDec(String arg) {
        return Integer.parseInt(arg, 2);
    }
}
