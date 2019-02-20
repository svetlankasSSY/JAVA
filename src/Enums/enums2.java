
package Enums;


public class enums2 {
    public enum Seasons {
        WINTER, SUMMER, SPRING, FALL;
    }
    public static void main(String[] args) {
        Seasons arg = Seasons.SUMMER;
        switch (arg){
            case WINTER:
            System.out.println("Зима близко!");
            break;
            case SPRING:
            System.out.println("Скоро лето!");
            break;
            case SUMMER:
            System.out.println("Ура каникулы!");
            break;
            case FALL:
            System.out.println("Снова на учёбу!");
            break;
            
        }
    }
}
