public class ArrayOverview {
    public static void main(String[] args) {
        int[] newArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int arr1[] = new int[10];

        System.arraycopy(newArray,0,arr1,0,10);

        newArray[1] = 10;
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        int[] arr2 = new int[20];
        System.out.println();
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
