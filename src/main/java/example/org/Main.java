package example.org;

public class Main {

    public static void main(String[] args) {

        int a = 1 + 1;
        System.out.println("1 + 1 = " + a);

        int b = 1 - 1;
        System.out.println("1 - 1 = " + b);

        int c = 2 * 5;
        System.out.println("2 * 5 = " + c);

        int v = 5 / 20;
        System.out.println("5 / 20 = " + v);

        int x = 32 % 5;
        System.out.println("32 % 5 = " + x);

        int k = 5;
        System.out.println("k++ = " + (k++));
        System.out.println("k = " + k);

        int y = 5;
        System.out.println("y-- = " + (y--));
        System.out.println("y = " + y);

        double o = 8.5;
        int o1 = 8;
        System.out.println("o * o1 = " + (o * o1));

        int a1 = 3;
        long a2 = 4;
        System.out.println("a1 + a2 = " + (a1 + a2));

     //   int a3 = -2147483649;

        boolean r = 3 == 3;
        System.out.println(" 3 == 3 = " + r);

        boolean r1 = 4 != 6;
        System.out.println(" 4 != 6 = " + r1);

        boolean p = 6 > 8;
        System.out.println(" 6 > 8 = " + p);

        boolean u = 7 < 1;
        System.out.println(" 7 < 1 = " + u);

        boolean t = 8 >= 1;
        System.out.println(" 8 >= 1 = " + t);

        boolean t2 = 9 > 3  && 3 > 2;
        System.out.println(" 9 > 3 && 3 > 2 =" + t2);

        boolean t3 = 9 < 3 || 3 < 2;
        System.out.println("9 > 3 || 3 < 2 = " + t3);

        boolean t4 = !(9 < 3 || 3 < 2);
        System.out.println("9 > 3 || 3 < 2 = " + t4);

        int d6 = 9;
        int d7 = 7;
        if (d6 > d7) {
            System.out.println("d6 > d7");
        } else {
            System.out.println("d6 < d7");
        }

        int num = 0;
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }





    }
}
