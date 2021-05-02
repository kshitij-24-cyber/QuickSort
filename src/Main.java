import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8,7,2,1,0,9,6};

        int Size = arr.length;
        quickSort run =  new quickSort();
        run.quickSort(arr, 0 ,Size - 1);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}