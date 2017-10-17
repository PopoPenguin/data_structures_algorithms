package data_structures.array_based;

class Queue {

    private int [] q;                           //declares an instance variable q that is an array
    private int putLocation, getLocation;       //declares two instance variable for the put and get location

    Queue (int a){                              //creates a class for queue
        q = new int[a];
        putLocation = getLocation = 0;          //initializes the value of put and get to 0

    }

    public void put(int num) throws DataStructureFull {                  //creates a put method
        if (putLocation == q.length) {                  //tests if the queue is full
            throw new DataStructureFull(putLocation);   //throw DataStructureFull exception
        }else
        q[putLocation++] = num;                 //if not takes integer and places in q[putLocation] then increments by 1

        return;
    }

    public int get() throws DataStructureEmpty {        //create a get method
        if (getLocation==putLocation){                  //if getLocation is the same as putLocation
            throw new DataStructureEmpty();  //throw DataStructureEmpty exception
        }else
        return q[getLocation++];                        //if false returns value at location then increments locations by 1
    }

    public int size(){                                  //create a method to determine size of array q

        return q.length;                                //returning length of q array
    }
}