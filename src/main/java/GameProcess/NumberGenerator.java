package GameProcess;

import java.util.List;

public class NumberGenerator {

    public Integer[] generateNewNumbers(int amountOfNumbers){
        Integer[] numbers = new Integer[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++){
            int number = (int) (Math.random() * 2);
            if (number == 0){
                numbers[i] = 2;
            } else {
                numbers[i] = 4;
            }
        }
        return numbers;
    }
}
