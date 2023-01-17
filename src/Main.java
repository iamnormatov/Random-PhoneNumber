import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        String kod[] = {"33", "88", "90", "91", "93", "94", "97", "99"}; // +998xx 777 77 77
        int a = kod.length;
        int b = random.nextInt(a);

        int s = random.nextInt(9); // +99897 x77 77 77
        int d = random.nextInt(9); // +99897 7x7 77 77
        int f = random.nextInt(9); // +99897 77x 77 77
        int g = random.nextInt(9); // +99897 777 x7 77
        int h = random.nextInt(9); // +99897 777 7x 77
        int j = random.nextInt(9); // +99897 777 77 x7
        int k = random.nextInt(9); // +99897 777 77 7x

        System.out.println("Keyingi o'yinda +998 " + kod[b] + " " + s+d+f+g+h+j+k + " raqam egasi ishtirok etadi");
    }
}