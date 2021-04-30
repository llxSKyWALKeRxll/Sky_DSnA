/**
 * Class name: array_1d.
 * Purpose: 
 * @author Vansh Pratap Singh // Sky
 * @version 30/04/2021
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
}
