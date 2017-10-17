package data_structures.array_based;

public class DataStructureEmpty extends Exception{

    int i ;

    public DataStructureEmpty(int i) {
        this.i = i;
    }

    public String toString() {

        return "Array Stack is empty!!!";
    }
}
