package data_structures.array_based;

public class DataStructureFull extends Exception {

    int i ;



    public DataStructureFull(int i) {
        this.i = i;
    }

    public String toString() {

        return "Array index out of bounds.   " + i + " is last spot!!!";
    }
}
