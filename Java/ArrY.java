import java.util.Scanner;
public class ArrY
{
Scanner sc = new Scanner(System.in);


public int[] input_Arry() // function to take array
{
    System.out.println("enter the number of element "); 
    int n = sc.nextInt();
    int arry[] = new int[n];

    // taking array input
    for(int i=0 ; i<n ; i++)
    {
        String set;

        switch (i)
        {
            case 0  ->  set = "st"; 
            case 1  ->  set = "nd"; 
            case 2  ->  set = "rd";  
            default ->  set = "th"; 
        }

        System.out.println("enter the " + (i+1) + set + " element of array");
        arry[i] = sc.nextInt();
    }
    return arry; 
}

public void show_Arry(int Array[] ,int n) // function to show array
{
    for(int i=0 ; i<n ; i++)
    {
        String set;

        switch (i)
        {
            case 0  ->  set = "st"; 
            case 1  ->  set = "nd"; 
            case 2  ->  set = "rd";  
            default ->  set = "th"; 
        }

        System.out.println("the" + " " + (i+1) + set + " " + "element of array is" + " " + Array[i]);
    }
}

public static void main(String args[])
{
    ArrY obj = new ArrY();
    int A[] = obj.input_Arry();
    obj.show_Arry(A,A.length);
}
}
