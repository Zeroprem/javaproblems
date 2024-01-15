import java.util.Scanner;
public class d2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int x=5;
        int  [][] abc=new int [rows][cols];

        for (int i=0;i<rows;i++){
            for ( int j=0;j<cols;j++){
                abc[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(abc[i][j] +" ");;
            }
            System.out.println();
        }
        for (int i=0;i<rows;i++){
            for ( int j=0;j<cols;j++){
                if (abc[i][j]==x){
                    System.out.println(i+","+j);
                }
            }
    }
}}
