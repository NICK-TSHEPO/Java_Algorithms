public class MyArrayList<E> {

    private E[] data;
    private int size; //Number of elements in the list
    private int MAXIELEMENTS = 100;

    /*Create an empty list */
public MyArrayList(){
    data = (E[])new Object[MAXIELEMENTS];
    size = 0; //Number of elements in the list
}

/*Clear the array */
public void Clear(){
    size = 0;
}

/*Create an add method */
public void add(int index, E e){
    //Ensure the index is in the right range
    if(index<0 || index>size)
        throw new IndexOutOfBoundsException
        ("Index: " +index + ", Size: " + size);
    
    //Move the elements to the right after the specified index
    for(int i=size-1; i>=index; i--)
        data[i+1] = data[i];

        //Insert new element to data
        data[index] = e;

        //increase size by 1
        size++;
}

/*Get size of the array */
public int size(){
    return size;
}

/*Get MAXIELEMENTS */
public int MAXIELEMENTS(){
    return MAXIELEMENTS;
}

/*Output */
public String toString(){
    String results = "[";
    
    for(int i=0; i<size; i++){
        results+= data[i];
        if(i<size-1)
            results+=", ";
    }
    return results.toString() + "]";
}
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    }
}
