package p4;


public class p4 {
    public static void main(String[] args) {
        //charAt() - vozvrawaet simvolq, stojawie na opredeljonnom indekse
        String sentence1 = "Я помню чудное мгновенье: ";
        char ch1 = sentence1.charAt(0);
        char ch2 = sentence1.charAt(5);
         char ch3 = sentence1.charAt(9);
         char ch4 = sentence1.charAt(24);
         System.out.println("Буква 0 индекса это: " + ch1);
         System.out.println("Буква 5 индекса это: " + ch2);
         System.out.println("Буква 9 индекса это: " + ch3);
        System.out.println("Буква 14 индекса это: " + ch4);
    }
}
