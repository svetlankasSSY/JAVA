package Massives;

import java.util.Arrays;

public class zadanie {

    public static void main(String[] args) {
        int[] mas1 = new int[20];
        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 21);
        }
        System.out.println("mas1 " + Arrays.toString(mas1));
        int min =0;
        int max =20;
        for(int i = 0; i < mas1.length; i++){
             
        }
        double average1 = 0; //srednee
        for (int i = 0; i < 20; i++) {  //nahodim summu vseh elementov massiva 4erez cikl for
            average1 += mas1[i];
        }
        
        average1 /= mas1.length;  //nahodim srednee arifmeti4eskoe
        System.out.println("Среднее арифметическое массива равно("+average1+")");
    }
    
    
}
