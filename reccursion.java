public class printn {
    public static void abc(int n){
        if(n>0) {
            System.out.print(n+" ");
            abc(n-1);
        }
    }
    public static void main(String[] args) {
        abc(5);
    }
}
