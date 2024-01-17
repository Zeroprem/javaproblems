public class printn {
    public static boolean abc(int arr[],int n){
        if(n==arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1]){
return false;
        }
        return abc(arr,n+1);

    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        boolean abc=abc(arr,0);
        if (abc){
            System.out.println("it is sorted");
        }
        else             System.out.println("it is  not sorted");


    }
}
