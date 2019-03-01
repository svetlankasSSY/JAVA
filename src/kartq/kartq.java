package kartq;

import java.util.Scanner;

public class kartq {

    public static void main(String[] args) {
        // 1 - inicializacija peremennqh
        int cardsPerPlayer = 5;
        int players = 0;

        String[] masti = {"Пики", "Буби", "Черви", "Крести"}; //suits
        String[] zna4enie = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"}; //rank
        int n = masti.length * zna4enie.length; //количество карт
        
        // 2 - ввод с консоли

        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsPerPlayer * players <= n) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("Игра прекращена.");
                        break;
                    } else if (players < 0) {
                        System.out.println("Число игроков не может быть меньше 0");
                    } else {
                        System.out.println("Слишком много игроков!");
                    }
                }
            } else {
                System.out.println("Вы ввели не число, или Ваше число слишком большое!");
            }
        }
        // 3 - inicializacija kolodq
        
        String[] koloda = new String[n]; // deck
        for (int i = 0; i < zna4enie.length; i++){
            for(int j = 0; j < masti.length; j++){
                koloda[masti.length *i + j] = zna4enie[i] + " " + masti[j];
            }
        }
        //4-peretasovka kolodq
        
        for (int i = 0; i < n; i++){
            int r = i + (int) (Math.random() * (n - i)); //slu4ajnaja karta
            String temp = koloda[r];
            koloda[r] = koloda[i];
            koloda[i] = temp;
        }
        
        //5 - razda4a kolodq
        
        for(int i = 0; i < players * cardsPerPlayer; i++){
            System.out.println(koloda[i]);
            if(i % cardsPerPlayer == cardsPerPlayer - 1){
                System.out.println();
            }
        }
    }
}
