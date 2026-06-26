import java.util.Scanner;

public class SelectionSort{
    public void selection(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIdx = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }

            if(minIdx!=i){
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }


    public void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SelectionSort sel = new SelectionSort();

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("The original array: ");
        sel.printArray(arr);

        sel.selection(arr);

        System.out.println("The sorted array: ");
        sel.printArray(arr);

        in.close();
    }
}