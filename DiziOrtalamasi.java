public class DiziOrtalamasi {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        double total;
        float result = 0;
        for (int j : array) {
            result += 1f / j;
        }
        total= array.length / result;

        System.out.println("Harmonic Average = " + total);
    }
    }



