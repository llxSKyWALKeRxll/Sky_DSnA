/**
 * Class name: array_1d.
 * Purpose: 
 * @author Vansh Pratap Singh // Sky
 * @version 30/04/2021 // v1
 */
public class array_1d<T extends Comparable<T>>
{
    /**
     * This is the 1d array itself.
     */
    T[] arr;
    /**
     * A counter variable used to keep a count of the number of elements present in the 1d array.
     */
    int ctr;
    /**
     * A counter variable to store the original size initialized for the 1d array.
     */
    int size;
    /**
     * This is the default constructor for the array_1d class. It will initialize the generic array with a default capacity of 10.
     */
    array_1d()
    {
        arr = (T[])new Comparable[10];
        ctr = 0;
        size = 10;
    }
    /**
     * This constructor for the array_1d class will initialize the generic array with the specified size, n.
     * @param n This is the size of the 1d array that will be specified by the user.
     */
    array_1d(int n)
    {
        arr = (T[])new Comparable[n];
        ctr = 0;
        size = n;
    }
    /**
     * This method returns the element at the specified index position, n.
     * @param n The value stored at the index position n will be returned to the function call.
     */
    T return_at_index(int n)
    {
        return arr[n];
    }
    /**
     * This method returns the index of the value passed as an argument (first instance).
     */
    int return_index(T n)
    {
        int res = -99;
        for(int i=0; i<ctr; i++)
        {
            if(arr[i] == n) res = i;
        }
        return res;
    }
    /**
     * This method will simply add the value that has been passed as an argument at the back of the array.
     * @param n This value will be added to the array.
     */
    void add_element(T n)
    {
        arr[ctr] = n;
        ctr++;
    }
    /**
     * This method will add the value that has been passed as an argument at the front of the array, 
     * and the rest of the elements will be shifted up by one, retaining the original order.
     * @param n This value will be added to the array.
     */
    void add_element_front(T n)
    {
        ++ctr;
        for(int i=ctr; i>0; i--) arr[i] = arr[i-1];
        arr[0] = n;
    }
    /**
     * This method prints all the elements currently present in the array, starting from the first index.
     */
    void print_all()
    {
        for(int i=0; i<ctr; i++) System.out.println("Element "+(i + 1)+": "+arr[i]);
    }
    /**
     * This method returns the total no. of elements currently present in the array.
     */
    int total_elements()
    {
        return ctr;
    }
}
