package p4;


public class p3 {
    public static void main(String[] args) {
        //length() - dlinna stroki
        String sentence = "Я помню чудное мгновенье!";
        System.out.println(sentence.length());
           System.out.println(); 
           
        //concat() - objedinenie strok
        String sentence1 = "Я помню чудное мгновенье: ";
        sentence1 = sentence1.concat("Передо мной явилась ты");
        System.out.println(sentence1);
        System.out.println();
        
        //toUpperCase() - delaet vse bukvq zaglavnqe v stroke
        String result = sentence1.toUpperCase();
        System.out.println("Result: " + result);
        System.out.println();
        
        //toLowerCase() - delaet vse bukvq malenkie v stroke
        String result1 = sentence1.toLowerCase();
        System.out.println("Result: " + result1);
        System.out.println();
        
        //trim() - udaljaet liwie probelq
        String s1 = "Я помню чудное мгновенье: ";
        String s2 = "     Передо мной явилась ты     ";
        System.out.println(s1);
         System.out.println(s2.trim());
          System.out.println();
          
          //substring() - vqvodit indeks
          System.out.println(sentence.substring(5));// tolko na4alnqj indeks (v dannom slu4ae na4inaja s 5 simvola
          System.out.println(sentence.substring(2, 10)); //so 2 po 10 simvolq
    }
}
