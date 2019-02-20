
package Enums;


public class enums {
    public enum Seasons {
        WINTER, SUMMER, SPRING, FALL;
    }
    
    public static void main(String[] args) {
      /*  System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.FALL);*/
      
      for(Seasons s : Seasons.values()){
          System.out.println(s);
      }
    }
}
