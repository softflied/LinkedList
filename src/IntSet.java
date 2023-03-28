public interface IntSet {
    public int getSize();
    public boolean isEmpty();
    /** Adds a new entry to this set, avoiding duplicates.
     @param newEntry The object to be added as a new entry.
     @return True if the addition is successful, or
     false if the item already is in the set. */
    public boolean add(int newEntry);

    /** Removes a specific entry from this set, if possible.
     @param anEntry The entry to be removed.
     @return True if the removal was successful, or false if not. */
    public boolean remove(int anEntry);
    public void reserve();
    public void rearenge();
    public LinkedListBasedSet sum(LinkedListBasedSet set1,LinkedListBasedSet set2);

    public LinkedListBasedSet dupPositives(LinkedListBasedSet p);

    public boolean isEven(LinkedListBasedSet ll);


    public boolean addFirst(int newEntry); // add Item in first index
    public boolean addLast(int newEntry); // add Item in last index

    public int getIndex(int anEntry); // get index according to value
    public boolean deleteAll(int Value); // delete all entered value in the list
    public boolean deleteFirst(int Value); // delete just first value int the list
    public boolean deleteLast(int Value); // delete just last value int the list

   public boolean addWithIndex(int Index,int NewEntry);  // add Item in any index
    public int getdata(int Index); //get data with any index

    public void clear();//clears the content of set
    public boolean contains(int anEntry); // return true if anEntry is currently in the Set
    public int[] toArray(); //return all the items currently in the list as an array
    public String toString();// returns the content of set as a string
    public IntNode findMid();
    public void findLoop();

    /*
    The union of two sets consists of their contents combined into a new set.
    Note that the union of two sets can not contain duplicate items.. Note that union does not affect the
    contents of set1 and set2.
    */
    public IntSet union(IntSet arg);

    /*
    The intersection of two set is a new set of the entries that occur in both sets. That is, it contains the overlapping entries.
    */
    public IntSet intersection(IntSet arg);
    public IntSet difference(IntSet arg);
    /*
    The difference of two collections is a new collection of the entries that would be left in one collection after removing those that also occur in the second.
    */

}
