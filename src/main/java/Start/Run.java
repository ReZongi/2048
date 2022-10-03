package Start;

import java.util.List;
import java.util.Scanner;

import GameProcess.Adder;
import GameProcess.Printer;

public class Run {

    public void RunGame() {
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        Creator creator = new Creator();
        Adder adder = new Adder();
        List<Integer[]> place = creator.createPlace();

        while (true) {
            printer.print(place);
            place = adder.step(place, scanner.nextLine());
        }
    }
}
