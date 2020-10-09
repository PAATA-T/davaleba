package BTU;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Integers : ");

        Scanner b = new Scanner(System.in);
        System.out.println("Enter Integers : ");

        Scanner c = new Scanner(System.in);
        System.out.println("Enter Integers : ");

        int Fnumber = Integer.parseInt(a.nextLine());
        int Snumber = Integer.parseInt(b.nextLine());
        int Tnumber = Integer.parseInt(c.nextLine());

        int sum = (Fnumber+Snumber+Tnumber);



        System.out.println("sum of integers = " + sum);

        int fist = Snumber /= 10;
        System.out.println("პირველი ციფრი: " + fist);

        int last = Fnumber % 10;
        System.out.println("ბოლო ციფრი: " + last);

        int sm = 0;
        while (Tnumber > 0) {
            sm = sm + Tnumber % 10;
            Tnumber = Tnumber / 10;
        }
        System.out.println("C-ს ციფრთა ჯამი: " + sm);

        int nw = (fist * last);
        System.out.println(nw);

        int nw1 = (sm + nw);
        System.out.println(nw1);


    }
}
