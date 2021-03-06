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
        size = 10;
        arr = (T[])new Comparable[size];
        ctr = 0;
    }
    /**
     * This constructor for the array_1d class will initialize the generic array with the specified size, n.
     * @param n This is the size of the 1d array that will be specified by the user.
     */
    array_1d(int n)
    {
        size = n;
        arr = (T[])new Comparable[size];
        ctr = 0;
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
    void add_element_back(T n)
    {
        if(ctr >= size)
        {
            System.out.println("The array is already full!");
            return;
        }
        else
        {
            arr[ctr] = n;
            ++ctr;
        }
    }
    /**
     * This method will add the value that has been passed as an argument at the front of the array, 
     * and the rest of the elements will be shifted up by one, retaining the original order.
     * @param n This value will be added to the array.
     */
    void add_element_front(T n)
    {
        if(ctr >= size)
        {
            System.out.println("The array is already full!");
            return;
        }
        else
        {
            ++ctr;
            for(int i=ctr; i>0; i--) arr[i] = arr[i-1];
            arr[0] = n;
        }
    }
    /**
     * This method removes the element that is present at the first index (0) of the array. The original order is retained.
     */
    void remove_element_front()
    {
        if(ctr<=0)
        {
            System.out.println("Array is already empty!");
            return;
        }
        else
        {
            --ctr;
            arr[0] = null;
            for(int i=0; i<=ctr; i++) arr[i] = arr[i+1];
            arr[ctr] = null;
        }
    }
    /**
     * This method removes the element which is present at the last index of the array.
     */
    void remove_element_back()
    {
        if(ctr == 0)
        {
            System.out.println("The array is already empty!");
            return;
        }
        else
        {
            arr[ctr - 1] = null;
            --ctr;
        }
    }
    /**
     * This method removes the element at the specified index from the array. The order of the array is retained.
     * @param n The element at this index will be removed from the array.
     */
    void remove_element_at(int n)
    {
        if(n < ctr)
        {
            for(int i=n; i<ctr; i++) arr[i] = arr[i + 1];
            arr[ctr - 1] = null;
            --ctr;
        }
        else
        {
            System.out.println("Index is out of bounds! Current elements in array: "+ctr);
            return;
        }
    }
    /**
     * This method prints all the elements currently present in the array, starting from the first index.
     */
    void print_elements()
    {
        if(ctr == 0)
        {
            System.out.println("The array is empty!");
            return;
        }
        else
        {
            for(int i=0; i<ctr; i++) System.out.println("Element "+(i + 1)+": "+arr[i]);
        }
    }
    /**
     * This methods prints the entire array, including the null elements.
     */
    void print_entire_array()
    {
        for(int i=0; i<size; i++) System.out.println("Element "+(i + 1)+": "+arr[i]);
    }
    /**
     * This method returns the total no. of elements currently present in the array.
     */
    int total_elements()
    {
        return ctr;
    }
    /**
     * This method returns the total size/capacity of the array that was originally initialized through the constructor.
     */
    int total_size()
    {
        return size;
    }
}
