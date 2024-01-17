package Patten;

public class Pyramid {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //reverse pyramid
        // for(int k=5;k>0;k--){
        //     for(int j=0;j<k;j++){
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }

        char ch = 'A';
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

    }
}
