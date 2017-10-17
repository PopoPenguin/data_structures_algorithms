package data_structures.array_based;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = input.nextInt();
        System.out.println();
        Stack test = new Stack(size);
        Queue test1 = new Queue(size);

        char ex = 'a';
        int exp = 1;

        while (true){
            try {
                test.push((ex++));
            } catch (DataStructureFull e) {
                System.out.println(e.toString());
                break;
            }
        }


        for (int i =test.getLocation(); i>=0;i--) {

            try {
                test.pop();
            } catch (DataStructureEmpty e) {
                System.out.println(e.toString());
            }

        }

        System.out.println();


        while (true){
            try {
                test1.put((exp++));
            } catch (DataStructureFull e) {
                System.out.println(e.toString());
                break;
            }
        }


        for (int i =0; i<=test1.size();i++) {

            try {
                System.out.println(test1.get());
            } catch (DataStructureEmpty e) {
                System.out.println(e.toString());
            }

        }



    }
}
