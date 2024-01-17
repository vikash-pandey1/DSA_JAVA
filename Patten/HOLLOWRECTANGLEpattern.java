package Patten;

public class HOLLOWRECTANGLEpattern {
    public static void main(String[] args) {
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<5;j++){
        //         if(i==0|| i==3 || j==0 || j==4){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //INVERTED & ROTATED HALF-PYRAMID pattern
        // for(int i=4;i>0;i--){
        //     for(int j=i-1;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }


        //INVERTED HALF-PYRAMID with Numbers 
        
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //FLOYD'S Triangle pattern
        int no=1;
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
    }
}
