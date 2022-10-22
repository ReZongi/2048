package GameProcess;

import Data.BinaryTuple;

import java.util.ArrayList;
import java.util.List;

public class PlaceHolder {

    public List<Integer[]> setEmptyPlacesHolder(List<Integer[]> place){
        NumberGenerator numberGenerator = new NumberGenerator();
        int zeros = 0;
        List<BinaryTuple> zeroKeys = new ArrayList<>();
        for (int i = 0; i < place.size(); i++) {
            for (int j = 0; j < place.get(i).length; j++) {
                if (place.get(i)[j] == 0){
                    zeroKeys.add(new BinaryTuple(i, j));
                    zeros++;
                }
            }
        }
        Integer[] numbers = new Integer[0];
        if (zeros >=3){
            numbers = numberGenerator.generateNewNumbers(((int) (Math.random() * 2)) + 1);
        } else if (zeros >= 1){
            numbers = numberGenerator.generateNewNumbers((int) (Math.random() * 2));
        }
        for (Integer number : numbers) {
            int key = (int) (Math.random() * (zeros - 1));
            place.get(zeroKeys.get(key).getFirst())[zeroKeys.get(key).getSecond()] = number;
        }
        return place;
    }
}
