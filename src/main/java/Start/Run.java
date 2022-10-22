package Start;

import java.util.List;
import java.util.Scanner;

import GameProcess.Adder;
import GameProcess.Checker;
import GameProcess.PlaceHolder;
import GameProcess.Printer;

public class Run {

    public void RunGame() {
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        Creator creator = new Creator();
        Checker checker = new Checker();
        PlaceHolder placeHolder = new PlaceHolder();
        Adder adder = new Adder();
        List<Integer[]> place = creator.createPlace();

        while (true) {
            printer.print(place);
            place = adder.step(place, scanner.nextLine());
            place = placeHolder.setEmptyPlacesHolder(place);
            if (checker.vinCheck(place)){
                printer.print(place);
                System.out.println("You win");
                break;
            }
            if (checker.loseCheck(place)){
                printer.print(place);
                System.out.println("You lose");
                break;
            }
        }
    }
}
