package Start;

import java.util.ArrayList;
import java.util.List;

public class Creator {

    public List<Integer[]> createPlace(){
        List<Integer[]> place = new ArrayList();
        for (int i = 0; i < 3; i++){
            Integer[] placeString = new Integer[] {0 ,0 ,0};
            place.add(placeString);
        }
        return place;
    }
}
