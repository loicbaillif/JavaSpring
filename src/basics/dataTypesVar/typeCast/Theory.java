package basics.dataTypesVar.typeCast;

// https://hyperskill.org/learn/step/3510

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Type casting - Theory");

        PrintTitle.printTitleLv2("Implicit casting");
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;
        float num5 = num4;
        double num6 = num5;
        System.out.println(num6);

        char ch1 = ':';
        int num10 = ch1;
        System.out.println("ch1 = " + ch1 + "\t-\t int num10 = ch1 ==> num10 = " + num10);

        PrintTitle.printTitleLv2("Explicit casting");
        double d1 = 321.2345;
        System.out.println("\t- d1 = " + d1 + " - (long) d1 = " + ((long) d1));
        System.out.println("\t- d1 = " + d1 + " - (byte) d1 = " + ((byte) d1));
        int result = (int) (3 + 2L);
        System.out.println("result = (3 + 2L) =>" + result);

        PrintTitle.printTitleLv1("End of theory");
    }
}
