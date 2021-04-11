package ch4;

import static helpers.OutputEasy.lprint;

public class Comparing {
    public static void main(String[] args) {
        String str1 = new String();
        str1 = "Fred";
        String str2 = new String();
        str2 = "Fred";

        if (str1 == str2) {
            lprint("str1 == str2" );
        }
        if (str1.equals(str2)) {
            lprint("they are equal" );
        }

    }
}
