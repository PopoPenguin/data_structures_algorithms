package data_structures.array_based;

public class Stack {
    private char[] ch;      //creating an array of char type to store values
    private int location ; //only need one location since push and pop work on the same spot

    Stack (int a){      // constructor for Stack setting the size as argument and setting location to 0
        ch = new char[a];
        location = 0;
    }

    //method to insert value into stack
    public void push(char input) throws StackFull {

            if (location == ch.length) {            //if location is same as length of array
                throw new StackFull(location);      //throw StackFull exception
            } else if (location < ch.length) {
                ch[location++] = input;             //add input value to location spot and increment after insertion

            }


    }

    //method to print out the current location
    public void pop() throws StackEmpty {

            if (location==0){           // if location is 0 then stack is empty
                throw new StackEmpty(location); //throw StackEmpty exception
            } else
                location--;             //decrement the location to the last index the last value was set
            System.out.println(ch[location]);   //print out last value entered
            return;




    }

    //retrieve the current location
    public int getLocation(){

        return location;
    }


}

