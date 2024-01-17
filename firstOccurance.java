public class firstOccurance {
    public static int abc(int arr[],int key ,int i){
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return abc(arr,key,i+1);

    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,3,5,6,7,8};
        System.out.println(abc(arr,5,1));

        }}
