package Massives;

public class MassiveString {

    public static void main(String[] args) {
        char[] chars = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'p', '1', '8'};
        String s1 = "Строки";
        System.out.println("Строка s1 до copyValueOf:      " + s1);
        //preobrazuem massiv v sto4ku
        s1 = s1.copyValueOf(chars);
        System.out.println("Строка s1 после copyValueOf:   " + s1);
        
        char[] chars1 = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'p', '1', '8'};
        String str1 = "Строки";
        String str2 = str1.copyValueOf(chars1);
        String str3 = str1.copyValueOf(chars1, 7, 7);// 7 - smewenie na 7 simvolov, 7 - vqvodim 7 simvolov
        System.out.println("Строка str1 без смещения:   " + str2);
        System.out.println("Строка str1 со смещением:   " + str3);
    }
}
