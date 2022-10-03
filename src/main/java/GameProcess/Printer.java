package GameProcess;

import java.util.Arrays;
import java.util.List;

public class Printer {
    public void print(List<Integer[]> place){
        for (int i = 0; i < place.size(); i++){
            System.out.println(Arrays.toString(place.get(i)));
        }
        System.out.print("Up - W, Down - S, Left - A, Right - D\n");
    }
}
