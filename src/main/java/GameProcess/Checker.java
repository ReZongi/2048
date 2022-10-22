package GameProcess;

import java.util.List;

public class Checker {

    public boolean vinCheck(List<Integer[]> place){
        for (Integer[] integers : place){
            for (Integer integer : integers){
                if (integer.equals(2048))
                    return true;
            }
        }
        return false;
    }

    public boolean loseCheck(List<Integer[]> place){
        for (int i = 0; i < place.size(); i++){
            for (int j = 0; j < place.get(i).length; j++){
                try {
                    if (place.get(i)[j].equals(0))
                        return false;
                    if (place.get(i)[j].equals(place.get(i)[j + 1]))
                        return false;
                    if (place.get(i)[j].equals(place.get(i)[j - 1]))
                        return false;
                    if (place.get(i)[j].equals(place.get(i + 1)[j]))
                        return false;
                    if (place.get(i)[j].equals(place.get(i - 1)[j]))
                        return false;
                } catch (Exception ignored){

                }
            }
        }
        return true;
    }
}
