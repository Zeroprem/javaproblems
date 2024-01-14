import java.util.*;
public class pattern {
    public static void main(String[] args) {
//        khali rectangle
        int m=5;
        int n=4;
//        for (int i=1;i<=n;i++){
//            System.out.println();
//
//            for (int j=1;j<=m;j++){
//                if (i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//        example of half reverse pyramid
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for (int i=1;i<=m;i++){
//            for (int j=1;j<=m-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//        }
//            System.out.println();
//        }
        for (int i=1;i<=m;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

}}
