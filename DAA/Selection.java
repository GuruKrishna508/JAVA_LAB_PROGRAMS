import java.util.Arrays;

public class Selection {
    static int[] arr = {4, 3, 5, 2, 1};  // made static for access in static methods

    public static void main(String[] args) {
        selection(arr);  // arr is now static, so this is fine
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = get_max(0, arr.length - i - 1, arr);
            swap(max, arr.length - i - 1, arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int get_max(int start, int last, int[] arr) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int start, int last, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}
