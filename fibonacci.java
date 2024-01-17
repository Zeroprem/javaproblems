public class printn {
    public static int abc(int n){
        if(n==1) {
            return 1;
        }
         else if (n==0) {
            return 0;
        }
         int fibnm1=abc(n-1);
         int fibnm2=abc(n-2);
         int ans =fibnm1+fibnm2;
return ans;

    }
    public static void main(String[] args) {
        int abc=abc(8);
        System.out.println(abc);
    }
}
