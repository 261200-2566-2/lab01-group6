import java.util.Scanner;

public class Main {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int ip;
        do{
            System.out.print("Enter the number of elements: ");
            ip = n.nextInt();
            if(ip == 0) return;
            if (ip < 1){
                System.out.println("Please enter a nonnegative number.");
                System.out.println();
            }
        }while (ip < 1);
        int[] arr = new int[ip];
        for(int i = 0; i < ip; i++){
            Scanner num = new Scanner(System.in);
            System.out.print("Enter a number for element " + (i+1) + ": ");
            arr[i] = num.nextInt();
        }
        sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

}