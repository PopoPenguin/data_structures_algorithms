package data_structures.array_based;

public class StackEmpty extends Exception{

    int i ;

    public StackEmpty(int i) {
        this.i = i;
    }

    public String toString() {

        return "Array Stack is empty!!!" + i + " location is first spot.";
    }
}
