public class Quicksort{
  public int[] quicksort(int[] arr, int start, int end) {
        if (start == end) {
            return arr;
        }
        int index = partition(arr, start, end);
        if (start < index - 1) {
            quicksort(arr, start, index - 1);
        }
        if (index < end) {
            quicksort(arr, index, end);
        }
        return arr;
    }

    public int partition(int[] arr, int leftIndex, int rightIndex) {
        int pivot = arr[Math.floorDiv((leftIndex + rightIndex), 2)];
        System.out.println("The pivot value is: " + pivot);

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                System.out.println("Swapping " + arr[leftIndex] + " and " + arr[rightIndex]);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
  
}
