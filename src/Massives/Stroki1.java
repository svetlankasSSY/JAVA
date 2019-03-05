package Massives;

public class Stroki1 {

    public static void main(String[] args) {
String slovo = new String("java");
String text = "Java is a general-purpose computer-programming language that is concurrent, "
        + "class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
String[] slova = text.split("\\W+");//s4itaet slova (latinica)
        System.out.printf("Слов в тексте = %d%n", slova.length);
        //4tobq vse slova razdeljalis ; dobavljaem cikl for
       for(String w: slova){
           System.out.print(w + ";");
       }
        System.out.println("\n-----------");
        System.out.printf(" Используем equalsIgnoreCase(%s,%s)= %s%n", slovo, slova[0], slovo.equalsIgnoreCase(slova[0]));
        System.out.printf(" Используем compareTo(%s,%s)= %s%n", slovo, slova[0], slovo.compareTo(slova[0]));
    }
}
