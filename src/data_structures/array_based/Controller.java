package data_structures.array_based;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = input.nextInt();
        System.out.println();
        Stack test = new Stack(size);

        char ex = 'a';

        while (true){
            try {
                test.push((ex++));
            } catch (StackFull stackFull) {
                stackFull.printStackTrace();
                break;
            }
        }


        for (int i =test.getLocation(); i>=0;i--) {

            try {
                test.pop();
            } catch (StackEmpty stackEmpty) {
                stackEmpty.printStackTrace();
            }

        }
    }
}
