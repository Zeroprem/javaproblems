public class butterfly {
    public static void main(String[] args) {
        int m=5;
        int n=4;
        for (int i=1;i<=m;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");

        }
            int space=2*(m-i);
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }

            System.out.println();
        }
        for (int i=m;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            int space=2*(m-i);
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }

            System.out.println();
        }


    }}

