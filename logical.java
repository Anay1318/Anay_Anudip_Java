public class logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println((a < b) && (b > 15));
        System.out.println((a > b) || (b == 20));
        boolean result = (a > b);
        System.out.println(!result);
    }
}
