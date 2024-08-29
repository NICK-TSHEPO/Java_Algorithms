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
public E remove(int index)
{
    if(index < 0 || index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
    E e = data[index];
    //Shifting data to the left
    for(int j = index; j < size-1; j++){
        data[j] = data[j+1];
    }
    data[size-1] = null; //Setting the element to null
    //Decrementing size
    size--;
    return e;


}

/*Get size of the array */
public int size(){
    return size;
}

/*Get MAXIELEMENTS */
public int MAXIELEMENTS(){
    return MAXIELEMENTS;
}

/*Palindrome method that read the same from the front and back alter the calling list */
public void makePalindrome()
{
    if(this.size() == 0)
    {
        return;
    }
    int j = size;
    for(int i = size - 1; i >= 0; i--)
    {
        this.add(j, data[i]);
        j++;
    }

}
/*Check if the value is exists */
public boolean contains(Object e)
{
    for(int i=0; i < size-1; i++)
    {
        if(e.equals(data[i]))
        {
            return true;
        }
    }
    return false;
}

/*Get the value using the index*/
public E get(int index)
{
    if(index < 0 || index >= size)
    {
        throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
    }
    return data[index];
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
       
        //System.out.println();
    }
}
