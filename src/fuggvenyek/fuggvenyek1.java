package fuggvenyek;

public class fuggvenyek1 {
    static int KVegNagyobb(int k, int min){
        min ++;
        while (!(Math.abs(min % 10) == k)){
            min++;
        }
        return min;
    }
    static boolean szomszedPrimE(int p){
        int vizsgalt;
        boolean ertek = false;
        for (int i = 1; i < p; i++) {
            vizsgalt = p % i;
            if (vizsgalt == 0){
                ertek = true;
            }
            else{
                ertek = false;
            }
        }
        return ertek;
        }
    }

