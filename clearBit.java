public class java {
  public static int clearBit(int n, int i){
      int bitmask=~(1<<i);
      return n&bitmask;

  }
    public static void main(String[] args) {
        System.out.println(clearBit(4 ,2));



    }
}
