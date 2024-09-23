public class Array {
    public static void main(String[] args) {
        int[][] cp = {{1,2,3}, {4,5,6}, {7,8,9}};

        int i;
        int j;

        System.out.println("#0");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(cp[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n#1");
        for(i=2;i>=0;i--){
            for(j=2;j>=0;j--){
                System.out.print(cp[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n#2");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(cp[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println("\n#3");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(cp[(i+1)%3][(j+1)%3]+" ");
            }
            System.out.println();
        }

        System.out.println("\n#4");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(cp[(i+1)%3][(j+2)%3]+" ");
            }
            System.out.println();
        }
    }
}