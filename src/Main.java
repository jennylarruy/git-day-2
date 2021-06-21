public class Main {

    public static void main(String[] args) {
        int[] originalArray = {3,0,1,8,7,2,5,4,6,9};
        originalArray = bubbleSort(originalArray);
        for (int i: originalArray){
            System.out.println(i);
        }

        String s = "hej";
        System.out.println(s);
        String s2 = "då";
        System.out.println(s+s2);


        originalArray = bubbleSortInDescendingOrder(originalArray);
        for (int i: originalArray){
            System.out.println(i);
        }

    }

    public static int[] bubbleSort(int[] data) {
        int storage;
        for (int j = data.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (data[i] > data[i + 1]) {
                    storage = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = storage;
                }
            }
        }
        return data;
    }

    public static int[] bubbleSortInDescendingOrder(int[] data) {
        int storage;
        for (int j = data.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (data[i] < data[i + 1]) {
                    storage = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = storage;
                }
            }
        }
        return data;
    }
}
