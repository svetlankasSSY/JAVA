package Massives;

public class massive1 {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        /*System.out.println(cars[0]);// ukazqvaem na massiv, kotoromu prinadlezit index
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]); 
        System.out.println();*/
        
        cars[2] = "Jaguar";
        System.out.println(cars[2]);
        System.out.println();
        
        System.out.println(cars.length + " - длинна массива");//s4itaem dlinnu massiva
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }

}
