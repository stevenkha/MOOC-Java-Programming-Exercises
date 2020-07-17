
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {25,10,9,8,12};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int first = array[0];
        for (int number : array) {
            if (first > number) {
                first = number;
            }
        }
        
        return first;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        int index = startIndex;
        int first = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (first > table[i]) {
                first = table[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int number = array[index1];
        array[index1] = array[index2];
        array[index2] = number;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int startIndex = indexOfSmallestFrom(array, i);
            int smallest = array[startIndex];
            while (array[i] != smallest) {
                int hold = array[startIndex];
                array[startIndex] = array[startIndex - 1];
                array[startIndex - 1] = hold;
                System.out.println(Arrays.toString(array));
                startIndex--;
            }
        }
    }
}
