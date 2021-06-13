import java.util.Random;

public class rand {
    public static void main(String args[]) {
        System.out.println(generateRandom(5));
    }

    private static String generateRandom(int length) {
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length); // bound is exclusive

        Random random = new Random();

        return Integer.toString(random.nextInt(max - min) + min);
    }
}