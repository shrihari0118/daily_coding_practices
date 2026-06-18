import java.util.Scanner;

public class InsertionSort {
    static void insertionsorting(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(arr[j] > temp && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        insertionsorting(arr);

        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
