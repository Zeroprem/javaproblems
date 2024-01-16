import java.awt.desktop.AppReopenedEvent;

public class Sorting1 {
    public static void bubleSort(int arr[]){
        for (int turn=0;turn<arr.length;turn++){
            int count=0;
            for (int j=0;j<arr.length-1-turn;j++){
//                swap
                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count=1;
                }
                if (count==0){
                    break;
                }

            }
        }
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[], int n){
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertion(int arr[],int n){
        for (int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int array[]={6,1,2,3,5,4};
       int n=array.length;
//        bubleSort(array);
//        selectionSort(array,n);
        insertion( array, n);
        printArr(array);

    }
}
