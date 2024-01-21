public class java {
  public static void binnaryString(int n,int lastPlace ,String str){
      if(n==0){
          System.out.println(str);
          return;
      }
      binnaryString(n-1,0,str+"0");
      if(lastPlace==0){
          binnaryString(n-1,1,str+"1");
      }
  }
    public static void main(String[] args) {
      binnaryString(4,0,"");



    }
}
