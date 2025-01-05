public class Oval {
    public static void main(String[] args) {
        int radius = 8;
        int centerX = radius;
        int centerY = radius;

        for (int y = 0; y <= 2 * radius; y++) {
            for (int x = 0; x <= 2 * radius; x++) {
                double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}