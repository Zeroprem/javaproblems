public class iThBit {
  public static void iTh(int n, int i){
      int a=1<<i;
      if((a&n)==0){
          System.out.println("0");
      }
      else {
          System.out.println("1");
      }
  }
    public static void main(String[] args) {
      iTh(4 ,2);



    }
}
