package basicjava;
import java.lang.Math;

public class BasicStuff {
    public static void main(String[] args) {
        double age0;
        double age1;
        age0 = 19;
        age1 = 19;

        System.out.println("We are " + age0 + " and " + age1 + " years old");
//        int sumOfAges = age0 + age1;
//        System.out.println(sumOfAges);

        System.out.println("We are " + (age0 + age1) + " years old");

        System.out.println(6 / 3);
        System.out.println((double)6 / (double)4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

        int hours = 1600;
        System.out.println("Hours: " + hours);
        int days = hours/24;
        System.out.println("Days: " + days);
        System.out.println("Weeks: " + days/7);

        double h, r, V, A;
        h = 3;
        r = 2;
        V = (Math.PI * (Math.pow(r,2)) * h) / 3;
        A = (Math.PI * Math.pow(r,2)) + (Math.PI*r*(Math.pow(((r*r) +(h*h)), .5)));
        System.out.println(V);
        System.out.println(A);
    }

}
