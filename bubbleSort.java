public class bubbleSort {
    public static void bubleSort(int arr[]){
        for (int turn=0;turn<arr.length;turn++){
            for (int j=0;j<arr.length-1-turn;j++){
//                swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
    public static void main(String[] args) {
        int array[]={5,2,3,4,3};
        bubleSort(array);
        printArr(array);

    }
}
