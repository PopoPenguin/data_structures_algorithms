package data_structures.array_based;

public class StackFull extends Exception {

    int i ;


    public StackFull(int i) {
        this.i = i;
    }

    public String toString() {

        return "Array index out of bounds.   " + i + " is last spot!!!";
    }
}
