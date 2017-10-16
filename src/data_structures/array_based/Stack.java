package data_structures.array_based;

public class Stack {
    private char[] ch;
    private int location ;

    Stack (int a){
        ch = new char[a];
        location = 0;
    }

    public void pushLoc(char input) {
        if (location == ch.length) {
            System.out.println("Stack is full");
            return;
        } else if(location<ch.length ) {
            ch[location++] = input;

        }

    }

    public void popLoc() {
        if (location==0){
            System.out.println("Stack is now empty");
            return;
        } else
            location--;
        System.out.println(ch[location]);
        return;


    }

    public int getLocation(){
        return location;
    }


}


