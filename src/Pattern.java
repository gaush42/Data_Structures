public class Pattern {

    public static void main(String[] args) {
        int t=0;
        for(int i=1;i<=5;i++,t=0){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //System.out.print("*");
            while(t!=2*i-1){
                System.out.print("*");
                t++;
            }
            System.out.println();
        }
    }
}
