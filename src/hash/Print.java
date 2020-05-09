package hash;

import java.util.HashMap;

public class Print {

    static HashMap<Character, Integer> s = new HashMap<>();

    public static void main(String[] args) {

//      System.out.println(hash("UAN"));
//      System.out.println(obtenerM(6));
//      System.out.println(hashMultiplicacion(123450));

        System.out.println(hash("svarela13"));

    }
    public static int hash(String S) {
        asignarIndiceAlfabeto();
        double suma = 0;
        double i = 0;
        double p = 29;
        double m = Math.pow(10, 9) + 9;
//      double m = 7;
        double pontencia = 0;
        double valorCaracter = 0;
        for (char c : S.toCharArray()) {
            System.out.println(c);
            pontencia = Math.pow(p, i);
            valorCaracter = s.get(c);
            suma = suma + valorCaracter * pontencia;
            i++;
        }
        int hash = (int) (suma % m);
        return hash;
    }

    /**
     * "We convert each character of s to an integer. Here we use the conversion a→1, b→2, …, z→26.
     *  Converting a→0 is not a good idea, because then the hashes of the strings a, aa, aaa, … all evaluate to 0."
     * de : https://cp-algorithms.com/string/string-hashing.html
     */
    public static void asignarIndiceAlfabeto() {
        int i = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            s.put(c, i);
            System.out.println(i + " " + c);
            i++;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            s.put(c, i);
            System.out.println(i + " " + c);
            i++;
        }
        for (char c = '0'; c <= '9'; c++) {
            s.put(c, i);
            System.out.println(i + " " + c);
            i++;
        }
    }


//    public static double hashMultiplicacion(double k){
//        double A = (Math.sqrt(5)-1)/2;
//        double m = 10;
//
//        double h = Math.floor(m*(k*A-Math.floor(k*A)));
//        return h;
//    }
//
//    public static double obtenerM(double w){
//        double A = (Math.sqrt(5)-1)/2;
//        var valor = w*Math.floor(A*Math.pow(2,w));
//
//        return valor;
//    }
}
