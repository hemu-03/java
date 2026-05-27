import java.util.*;

class miss {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr); // sorting

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i + 1] != arr[i] + 1) {
                System.out.println("Missing Number = " + (arr[i] + 1));
            }
        }
    }
}