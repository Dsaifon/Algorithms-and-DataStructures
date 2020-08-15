public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[100];

        for(int i = 0; i < 100; ++i) {
            myArray[i] = 2 * i;
        }

        int index = binarySearch(myArray, 198);
        if(index != -1){
            System.out.println("Found "+ myArray[index] +" at position "+ index);
        } else {
            System.out.println("Value was not found");
        }

    }

    static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;

            if(array[mid] == target)
                return mid;
            else if(array[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;        
        }

        return -1;
    }
}