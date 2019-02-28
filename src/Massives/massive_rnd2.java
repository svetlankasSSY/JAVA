
package Massives;


public class massive_rnd2 {
    public static void main(String[] args) {
        int[] mas = new int[12]; //sozdajom massiv na 12 zna4enij
        int maxNumber = -16; //sozdajom peremennuju s max zna4eniem
        int maxIndex = 0; //
        
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int) (Math.random()*31)-15;
            System.out.print(mas[i] + " ");
            if (maxNumber <= mas[i]){
                maxNumber = mas[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("максимальное число: " + maxNumber);
    }
}
