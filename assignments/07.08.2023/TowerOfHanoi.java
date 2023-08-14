public class TowerOfHanoi {
    
    public static int moves =0;

    public static void toh(int n, String src, String inter, String dest){
        if(n==1){
            moves++;
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return;
        }

        toh(n-1,src,dest,inter);
        moves++;

        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        toh(n-1, inter, src, dest);
    }



    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int n=15;
        toh(n, "A", "B", "C");
        System.out.println("total no of moves is: " + moves);
        long finish = System.currentTimeMillis();

        long time = finish - start;

        System.out.println("time taken to run: " +time+" ms");
    }
}
