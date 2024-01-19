public class printn {
    public static int abc(int x,int n){
        if(n==0){
            return 1;
        }
//       int xnm1= abc(x,n-1);
//       int xn=x*xnm1;
//       return xn;
return x*abc(x,n-1);

    }

    public static void main(String[] args){
//        int arr[]={1,2,3,4,5,3,5,6,7,8};
//        int i= 0;
        System.out.println(abc(2,22));

        }}
