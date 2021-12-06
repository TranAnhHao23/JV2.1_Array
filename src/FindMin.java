public class FindMin {
    public static void main(String[] args) {
        int[] arr1 = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Số nhỏ nhất trong mảng là "+ minValue(arr1));
    }



    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        };
        return min;
    }
}
