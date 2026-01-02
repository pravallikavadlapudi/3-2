public class Basic {
    public static void main(String[] args) {
        // Arithematic
        int a = 20;
        int b = 10;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        // Increment and decrement
        int p = 5;
        int q = 10;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(q--);
        System.out.println(q);
        // Relational
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        // Assignment
        System.out.println(a += b);
        System.out.println(a -= b);
        // Logical
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);
    }
}