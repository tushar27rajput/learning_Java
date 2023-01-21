package testJava;

public class LinearSearch {
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 1;
        int index = search(array, key);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}

/**
 * In this example, the search method takes in an array and a key as arguments, and iterates through the array using a for loop. 
 * If the element at the current index is equal to the key, the method returns the index. 
 * If the key is not found in the array, the method returns -1.
 */

