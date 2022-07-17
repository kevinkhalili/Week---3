import java.lang.reflect.Array;
import java.util.Arrays;

//This program creates two arrays and initialized with some integer values
//These integer values are represented with different ages. It calculates
//the difference between the first and last elements of array
//writen by Kevin Khalili

public class Main {
    public static void main(String[] args) {

        //declaring and initializing an array of integer called ages that has 8 elements
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        //subtracting the value of first element from the value of last element of the array
        int differenceOfFirstAndLastElement =  ages[ages.length-1] - ages[ages.length-ages.length];
        //printing the difference to the console
        System.out.println("The difference is: " + differenceOfFirstAndLastElement);

        //printing contents of array ages
        System.out.println("The ages are: ");
        for (int i = 0; i < ages.length; i++)
            System.out.print(ages[i] + " ");
        System.out.println();

        double averageOfAges = 0;
        double sum = 0.0;

        for (int i = 0; i < ages.length - 1; i++){
            sum = sum + ages[i];
        }
        //calculating the average value of ages
        averageOfAges = sum/ages.length;
        System.out.printf("The average age is: %2.2f%n" , averageOfAges);

        //creating a copy of array ages with one more element
        int[] copyOfAges = Arrays.copyOf(ages, 9);
        //assigning a new value of age to the newly added element
        copyOfAges[copyOfAges.length-1] = 53;

        //subtracting the value of first element from the value of last element of the array
        differenceOfFirstAndLastElement =  copyOfAges[copyOfAges.length-1] - copyOfAges[copyOfAges.length-copyOfAges.length];
        //printing the difference to the console
        System.out.println("The difference is: " + differenceOfFirstAndLastElement);

        System.out.println("The ages are: ");
        for (int i = 0; i < copyOfAges.length; i++)
            System.out.print(copyOfAges[i] + " ");
        System.out.println();

        //calculating the average value of ages
        averageOfAges = sum/copyOfAges.length;
        System.out.printf("The average age is: %2.2f%n" , averageOfAges);

    }
}