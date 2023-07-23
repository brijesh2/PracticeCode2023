package Problems;

import java.util.stream.IntStream;

public class Union2Array {
    public static void main(String[] args) {
        int []a = {1,2,3};
        int []b = {1,2,3,4,5};
        int count = b.length;

        for(int i = 0; i<a.length; i++){
            if(!IntStream.of(b).anyMatch(v -> v == 1)){
                count += 1;
            }
        }
        System.out.println(count);

    }
}
