package BTU;
import java.util.Random;
import java.util.TreeMap;

public class mesame {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 100;
//        Random rand = new Random();
//        int ran = rand.nextInt((b - a) + 1) + a;
//        System.out.println(ran);




        int count = 40;
        int min = 1;
        int max = 250;

        TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        for (int i=0; i<count; i++){
            int d = ( min + (int) (Math.random() * (max-count+1)) );
            if (!mp.containsKey(d)){
                mp.put(d, 0);
            }
            mp.put(d, mp.get(d) + 1);
        }


        int j = 0;
        for (int num : mp.keySet()){
            int cnt = mp.get(num);
            for (int i=0; i<cnt; i++){
                j++;
//                print 40 numbers
                System.out.println(num);
                if (num % 2 == 1) {
                    int w = 0;
                    int s_um = w = w + 1;
                    System.out.println(s_um);
                }
                else {
//                    int q = 0;
//                    System.out.println(q += 1);

                }
            }
        }
    }
}
