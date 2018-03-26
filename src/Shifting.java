import java.util.Arrays;

public class Shifting {

    public static void main(String[] args) {

        int n = 2;
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(shiftingElements(n, numbers)));
    }

    public static int[] shiftingElements(int shifter, int[] numbers) {
        for (int i = 0; i < shifter; i++) {
            int temp = numbers[numbers.length - 1];
            for (int j = numbers.length - 1; j > 0; j--) {
                numbers[j] = numbers[j-1];
            }
            numbers[0] = temp;
        }
        return numbers;
    }
}

