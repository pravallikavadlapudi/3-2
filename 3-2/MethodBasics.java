public class MethodBasics {
    // int add() {
    // int a = 10;
    // int b = 20;
    // return a + b;
    // }

    // public static void main(String[] args) {
    // MethodBasics obj = new MethodBasics();
    // int result = obj.add();
    // System.out.println(result);
    // }

    // Passing parameters by vaue
    // static void changevalue(int x) {
    // x = 100;
    // }

    // public static void main(String[] args) {
    // int a = 10;
    // changevalue(a);
    // System.out.println(a);
    // }

    // Multiple Parameters and their order
    // static int add(int a, int b) {
    // return a + b;
    // }

    // public static void main(String[] args) {
    // int result1 = add(10, 5);
    // System.out.println(result1);

    // int result2 = add(5, 10);
    // System.out.println(result2);
    // }

    // Benefits of Method Overloading:-
    // Same method name but different parameter list
    // static int add(int a, int b) {
    // return a + b;
    // }

    // static double add(double d1, double d2) {
    // return d1 + d2;
    // }

    // public static void main(String[] args) {

    // }

    // Example for Variable Arguments
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total = total + n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }
} 
