package testJava;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
        int[] arr = {5, 1, 4, 2, 8,11,99,22,78,100};
        bubbleSort(arr);
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

/**This program defines a method called bubbleSort that takes an array of integers as a parameter. 
 * The method uses nested loops to iterate through the array and compare adjacent elements. 
 * If an element is found to be larger than the element next to it, the two elements are swapped. 
 * This process continues until the entire array is sorted in ascending order. 
 * The main method calls the bubbleSort method and then prints the sorted array.
 * */
