package Massives;


public class StringMassive {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        char[] result = str.toCharArray();//sozdajom simvolnqi massiv s pomowju metoda toCharArray
        System.out.println("Массив символов:");
        for(int i = 0; i < result.length; i++){
            System.out.println("Элемент [" + i + "]: " + result[i]);
        }
    }
}
