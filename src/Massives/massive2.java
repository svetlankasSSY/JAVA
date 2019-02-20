package Massives;

public class massive2 {

    public static void main(String[] args) {
        int[] array1 = {4, 8, 16, 32, 64};

        System.out.println("Dlinna massiva: " + array1.length);

        System.out.println();

        int k = array1.length;
        System.out.println(k);// dlinna massiva, 2-oi sposob

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
