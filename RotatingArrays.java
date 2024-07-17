/*
*You may have been using Java for a while. Do you think a simple Java array question
can be a challenge? Let’s use the following problem to test.
Problem: Rotate an array of n elements to the left by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
ways do you know to solve this problem?
*
*
* In a straightforward way, we can create a new array and then copy elements to the
new array. Then change the original array by using System.arraycopy().
*
* However we gonna use a simpler way by printing the original array then shifting the array k times to the left by
* taking the first k numbers and putting them in a temporary array then displaying the current contents of the array
* then adding the contents of the temporary array to the end of the new array.
* */
import java.util.Scanner;
import java.util.*;
public class RotatingArrays {
    public static void main(String[] args) {
        int [] originalArray = {1,2,3,4,5,6,7};
        int sizeOfArray = originalArray.length;
        int leftRotateNumber;
        Scanner input = new Scanner(System.in);
        int tempArray[] = new int[sizeOfArray];
        int tempArrCounter = 0;

        System.out.println("Enter the amount you would like to rotate the array leftwards: ");
        leftRotateNumber = input.nextInt();

        //prints out the original array
        System.out.println("Here's the original array");
        for(int i = 0; i < originalArray.length; i++)
        {
            System.out.print(originalArray[i]+" ");
        }
        System.out.println();

      // puts the array elements after the k or number which we would like to rotate left into a temporary array, 
      // example if we want to rotate the array 3 elements to the left
      // the first 3 elements of the array are left as is 
      // the remainder is inserted into the temporary array 
        for(int i = leftRotateNumber; i<sizeOfArray; i++)
        {
            tempArray[tempArrCounter] = originalArray[i];
            tempArrCounter++;
        }

      //the remainder of the elements before the k number above are appended to the end of the temp array 
      // example if the k is 3 the first 3 elements are appended to the end of 
      // temporary array 
        for(int i =0; i<leftRotateNumber; i++)
        {
            tempArray[tempArrCounter] = originalArray[i];
            tempArrCounter++;
        }
        //the temporary are is now updating the original array, after being shifted leftwards k times
        for(int i = 0; i < sizeOfArray; i++)
        {
            originalArray[i] = tempArray[i];
        }
        // new shifted array is displayed 
        System.out.println("The new array after being rotated left "+leftRotateNumber+" times is: ");
        for(int i = 0; i <sizeOfArray; i++)
        {
            System.out.print(originalArray[i] +" ");
        }


    }

}
