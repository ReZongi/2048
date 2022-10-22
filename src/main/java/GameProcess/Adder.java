package GameProcess;

import java.util.List;

public class Adder {

    public List<Integer[]> step(List<Integer[]> place, String stepVector){
        int i;
        switch (stepVector){
            case "w":
                for (int j = 0; j < 3; j++){
                    i = j;
                    if(place.get(1)[j].equals(place.get(2)[j])){
                        place.get(1)[j] = place.get(1)[j] * 2;
                        place.get(2)[j] = 0;
                    }
                    if(place.get(1)[j].equals(0)){
                        place.get(1)[j] = place.get(2)[j];
                        place.get(2)[j] = 0;
                        if (!place.get(1)[j].equals(0))
                            i = -1;
                    }
                    if(place.get(1)[j].equals(place.get(0)[j])){
                        place.get(0)[j] = place.get(0)[j] * 2;
                        place.get(1)[j] = 0;
                    }
                    if(place.get(0)[j].equals(0)){
                        place.get(0)[j] = place.get(1)[j];
                        place.get(1)[j] = 0;
                        if (!place.get(0)[j].equals(0))
                            i = -1;
                    }
                    j = i;
                }
                break;
            case "s":
                for (int j = 0; j < 3; j++){
                    i = j;
                    if(place.get(1)[j].equals(place.get(0)[j])){
                        place.get(1)[j] = place.get(1)[j] * 2;
                        place.get(0)[j] = 0;
                    }
                    if(place.get(1)[j].equals(0)){
                        place.get(1)[j] = place.get(0)[j];
                        place.get(0)[j] = 0;
                        if (!place.get(1)[j].equals(0))
                            i = -1;
                    }
                    if(place.get(1)[j].equals(place.get(2)[j])){
                        place.get(2)[j] = place.get(2)[j] * 2;
                        place.get(1)[j] = 0;
                    }
                    if(place.get(2)[j].equals(0)){
                        place.get(2)[j] = place.get(1)[j];
                        place.get(1)[j] = 0;
                        if (!place.get(2)[j].equals(0))
                            i = -1;
                    }
                    j = i;
                }
                break;
            case "d":
                for (int j = 0; j < 3; j++) {
                    i = j;
                    if (place.get(j)[1].equals(place.get(j)[2])) {
                        place.get(j)[2] = place.get(j)[1] * 2;
                        place.get(j)[1] = 0;
                    }
                    if (place.get(j)[2].equals(0)) {
                        place.get(j)[2] = place.get(j)[1];
                        place.get(j)[1] = 0;
                        if (!place.get(j)[2].equals(0))
                            i = -1;
                    }
                    if (place.get(j)[1].equals(place.get(j)[0])) {
                        place.get(j)[1] = place.get(j)[1] * 2;
                        place.get(j)[0] = 0;
                    }
                    if (place.get(j)[1].equals(0)) {
                        place.get(j)[1] = place.get(j)[0];
                        place.get(j)[0] = 0;
                        if (!place.get(j)[1].equals(0))
                            i = -1;
                    }
                    j = i;
                }
                break;
            case "a":
                for (int j = 0; j < 3; j++) {
                    i = j;
                    if (place.get(j)[1].equals(place.get(j)[0])) {
                        place.get(j)[0] = place.get(j)[1] * 2;
                        place.get(j)[1] = 0;
                    }
                    if (place.get(j)[0].equals(0)) {
                        place.get(j)[0] = place.get(j)[1];
                        place.get(j)[1] = 0;
                        if (!place.get(j)[0].equals(0))
                            i = -1;
                    }
                    if (place.get(j)[1].equals(place.get(j)[2])) {
                        place.get(j)[1] = place.get(j)[1] * 2;
                        place.get(j)[2] = 0;
                    }
                    if (place.get(j)[1].equals(0)) {
                        place.get(j)[1] = place.get(j)[2];
                        place.get(j)[2] = 0;
                        if (!place.get(j)[1].equals(0))
                            i = -1;
                    }
                    j = i;
                }
                break;
        }
        return place;
    }
}
