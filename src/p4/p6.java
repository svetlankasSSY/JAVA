
package p4;


public class p6 {
    public static void main(String[] args) {
        //equals - ravnq li 2 objekta
        String str1 = "Доброе утро";
        String str2 = "Доброе утро";
        String str3 = "Добрый вечер";
        System.out.println("Строка '" + str1 + "'равны'" + str2 + "' : " + str1.equals(str2));
        System.out.println("Строка '" + str1 + "'равны'" + str3 + "' : " + str1.equals(str3));
    }
}
