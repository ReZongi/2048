package GameProcess;

import java.util.List;

public class NumberGenerator {

    public Integer[] generateNewNumbersInPlace(List<Integer[]> place){
        int zeros = 0;
        for (Integer[] integers : place) {
            for (Integer integer : integers) {
                if (integer == 0){
                    zeros++;
                }
            }
        }
        Integer[] numbers = new Integer[0];
        if (zeros >=2){
            numbers = generateNewNumbers(2);
        } else if (zeros == 1){
            numbers = generateNewNumbers(1);
        }

        return numbers;
    }


    private Integer[] generateNewNumbers(int amountOfNumbers){
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
