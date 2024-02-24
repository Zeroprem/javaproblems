public class clearIbits {
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
    public static void main(String[] args) {
        System.out.println(clearIbits(4,3));



    }
}
