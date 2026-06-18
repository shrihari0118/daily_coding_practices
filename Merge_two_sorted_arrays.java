import java.util.Scanner;

public class Merge_two_sorted_arrays {

    static void merge_sorted_arrays(int[] arr1, int[] arr2, int[] result){
        int i = 0, j= 0, k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }
            else{
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] result = new int[size1 + size2];

        for(int i = 0; i<size1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j<size2; j++){
            arr2[j] = sc.nextInt();
        }

        merge_sorted_arrays(arr1, arr2, result);

        for(int i= 0; i<size1+size2; i++){
            System.out.print(result[i]+" ");
        }
    }
}
