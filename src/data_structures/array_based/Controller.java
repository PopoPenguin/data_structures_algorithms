package data_structures.array_based;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);             //initiate scanner
        System.out.println("Enter size of stack/queue");    //request an input from user to set size of queue and stack
        int size = input.nextInt();                         //storing input into variable size
        System.out.println();
        Stack test = new Stack(size);                       //creating object of Stack with size given by user
        Queue test1 = new Queue(size);                      //creating object of Queue with size given by user

        char ex = 'a';                                      //creating an incrementing char for Stack
        int exp = 1;                                        //creating an incrementing int for Queue

        while (true){                                       //while true will place values into stack and increment by 1
            try {                                           //try and catch custom error for DataStructureFull
                test.push((ex++));
            } catch (DataStructureFull e) {
                System.out.println(e.toString());           //outputting Exception method to describe error
                break;
            }
        }


        for (int i =test.getLocation(); i>=0;i--) {         //outputting results of Stack until Stack is empty

            try {
                test.pop();                                 //try and catching error of DataStructureEmpty
            } catch (DataStructureEmpty e) {
                System.out.println(e.toString());
            }

        }

        System.out.println();


        while (true){                                       //same as stack except with queue and integers
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
