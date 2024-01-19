public class tilesProblem {
    public static int abc(int n){
        if(n==1||n==0){
            return 1;
        }
      int fnm1=abc(n-1);
      int fnm2=abc(n-2);
      int c=fnm1+fnm2;
        return c;

    }

    public static void main(String[] args){
//        int arr[]={1,2,3,4,5,3,5,6,7,8};
//        int i= 0;
        System.out.println(abc(5));

        }}
