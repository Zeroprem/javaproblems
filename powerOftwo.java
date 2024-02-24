public class powerOfTwo {
    public static int setBit(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;

    }
  public static int clearBit(int n, int i){
      int bitmask=~(1<<i);
      return n&bitmask;

  }
  public static int updateBit(int n,int i, int newbit){
//        if(newbit==0){
//           return clearBit(n,i);
//        }
//        else {
//            return setBit(n,i);
//        }
      n=clearBit(n,i);
      int bitmask= newbit<<i;
      return bitmask|n;
  }

  public static int clearIbits(int n , int i ){
        int bimask=(~0)<<i;
        return n&bimask;
  }
  public static int clearBitRange(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask =a|b;
        return n&bitmask;
  }
    public static boolean powerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(5));


//pring small a to z
//        for(char cc='A';cc<='Z';cc++){
//            System.out.println((char) (cc|' '));
//        }
//
//

    }
}
