public class printn {
    public static void abc(String str ,int inx,StringBuilder strNew,boolean []map){
if (inx==str.length()){
    System.out.println(strNew);
    return;
}
char currentChar=str.charAt(inx);
        if (map[currentChar -'a']==true){
                abc(str,inx+1,strNew,map);
        }
        else{
            map[currentChar -'a']=true;
            abc(str,inx+1,strNew.append(currentChar),map);
        }

    }

    public static void main(String[] args){
//        int arr[]={1,2,3,4,5,3,5,6,7,8};
//        int i= 0;
        String a="aaaaabbccdd";
         abc(a, 0, new StringBuilder(""), new boolean[26]);
        }}
