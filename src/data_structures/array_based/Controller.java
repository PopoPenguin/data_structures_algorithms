package data_structures.array_based;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = input.nextInt();
        System.out.println();
        Stack test = new Stack(size);

        test.pushLoc('a');
        test.pushLoc('b');
        test.pushLoc('c');
        test.pushLoc('d');
        test.pushLoc('e');


        for (int i =test.getLocation(); i>=0;i--) {

            test.popLoc();

        }


    }
}
