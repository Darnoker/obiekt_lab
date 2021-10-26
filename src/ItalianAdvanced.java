public class ItalianAdvanced extends ItalianBasic {
    static String[] numbersPL = {"jeden", "dwa", "trzy"};
    static String[] numbersIT = {"uno", "due", "tre"};

    public static void noTOpl(String word) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < numbersIT.length; i++) {
            if (word.equals(numbersIT[i])) {
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) {
            System.out.println("PL -> " + numbersPL[index]);
        }
        else {
            System.out.println("There is no such number");
        }
    }

    public static void noTOit(String word) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < numbersPL.length; i++) {
            if (word.equals(numbersPL[i])) {
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) {
            System.out.println("IT -> " + numbersIT[index]);
        }
        else {
            System.out.println("There is no such number");
        }
    }


}
