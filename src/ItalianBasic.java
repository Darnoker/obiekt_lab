import java.util.concurrent.TransferQueue;

public class ItalianBasic {
   static String[] basicPL = {"cześć", "dziękuję", "tak", "nie"};
   static String[] basicIT = {"ciao", "grazie", "si", "no"};


    public static void plTOit(String word) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < basicPL.length; i++) {
            if (word.equals(basicPL[i])) {
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) {
            System.out.println("IT -> " + basicIT[index]);
        }
        else {
            System.out.println("There is no such word");
        }
    }


    public static void itTOpl(String word) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < basicIT.length; i++) {
            if (word.equals(basicIT[i])) {
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) {
            System.out.println("PL ->  " + basicPL[index]);
        }
        else {
            System.out.println("There is no such word");
        }
    }
}
