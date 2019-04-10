public class Main {

    static float add(float a, float b, float c) {
        return a + b + c;
    }

    static String add(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add("f", "e", "r"));
        System.out.println(add(4, 2, 2));
    }
}
