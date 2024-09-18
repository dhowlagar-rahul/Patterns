public class PatternThree {
    public static void main(String[] args) {
        int n=4;
        //outerloop
        for(int i=1; i<=n; i++){
            //innerloop -> Space printer
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //innerloop -> Star printer
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

