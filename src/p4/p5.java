
package p4;


public class p5 {
    public static void main(String[] args) {
        //endsWith() - opredeljaet zakan4ivaetsja li stroka zadannqm zna4eniem.
        String sentence = "Я помню чудное мгновенье: ";
        boolean b1 = sentence.endsWith("мгновенье: ");
        boolean b2 = sentence.endsWith("мгновенье!");
        System.out.println("Строка " + sentence + "заканчивается 'мгновенье: '? " + b1);
        System.out.println("Строка " + sentence + "заканчивается 'мгновенье!'? " + b2);
        
    }
}
