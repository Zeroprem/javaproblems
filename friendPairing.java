public class java {
    public static int friendPairing(int n){
        if(n==2||n==1){
            return n;

        }
//        int fnm1=friendPairing(n-1);
//        int fnm2=friendPairing(n-2);
//        int pairways=(n-1)*fnm2;
//        int totways=fnm1+pairways;
//        return totways;
        return friendPairing(n-1)+(n-1)*friendPairing(n-2);

    }
    public static void main(String[] args) {


        System.out.println(friendPairing(4));
    }
}
