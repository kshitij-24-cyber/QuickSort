public class quickSort {

    public void quickSort(int arr[], int end, int start) {
        if (start < end) {

            int pivot = mypivot(arr, start, end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);

        }
    }

    public int mypivot(int[] arr, int p, int q) {
        int pivot = q;
        int i = p - 1;
        for (int j = p; j <= q; j++) {
            if (arr[j] <= arr[pivot]) {

                i++;
                int temp = arr[i];
                arr[i] = arr[j] = temp;
            }
            return i;

        }
        return pivot;
    }
}
