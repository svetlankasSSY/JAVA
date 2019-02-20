//pere4islenie
package Enums;
public class enums3 {
    static enum Days{
        Sunday, Monday, Tuesday, Wendsday, Furthday, Friday, Satarday
    }
    public static void main(String[] args) {
        System.out.println("====Дни недели====");
        for(Days d: Days.values()){
            System.out.println(d);
        }
    }
}
