import java.util.Scanner;

public class BubbleSort{
    public void bubble(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
        BubbleSort sort = new BubbleSort();

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("The original array: ");
        sort.printArray(arr);

        sort.bubble(arr);

        System.out.println("The sorted array: ");
        sort.printArray(arr);

        in.close();
    }
}