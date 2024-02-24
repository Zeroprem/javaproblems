public class countSetBits {
  
 
    public static boolean powerOfTwo(int n){
        return (n&(n-1))==0;
    }
public static int countSetBits(int n){
    int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
}
    public static void main(String[] args) {
//        System.out.println(powerOfTwo(5));
        System.out.println(countSetBits(11));

    }
}
