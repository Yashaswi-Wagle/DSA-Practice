import java.util.Scanner;

public class InsertionSort{
    void insertion(int[] arr){
        int i,j, key;
        for(i=0; i<arr.length; i++){
            key = arr[i];
            j=i-1;

        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }

        arr[j+1]=key;
        }
    }

    public void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }
    System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InsertionSort sort = new InsertionSort();

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("The original array: ");
        sort.printArray(arr);

        sort.insertion(arr);

        System.out.println("The sorted array: ");
        sort.printArray(arr);

        in.close();
    }
}