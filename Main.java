import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
//    functionality ex-6
    static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }
        }
        return list;
    }

    public static void printArray(int[] array)
{
    for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
    System.out.println();
}
    public static void main(String[] args) {
       System.out.println("Hello world!");
//   ex-1
        int[] num_array = {50, -20, 0, 30, 40, 60, 10};
        System.out.println(num_array.length>=2&&num_array[0]==num_array.length -1);


//        ex-2
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(k +" largest elements of the said array are");
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");

//        ex-3
        Integer _nums[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        System.out.println("Original Array:\n"+Arrays.toString(_nums));
         for(int i=0 ; i < _nums.length;i++){
             sum = sum + _nums[i];
         }
        double average = sum / _nums.length;
        System.out.println("The average of the said array is: " + average);
        System.out.println("The numbers in the said array that are greater than the average are: ");
        for(int i = 0; i < _nums.length; i++) {
            if(_nums[i] > average) {
                System.out.println(_nums[i]);
            }
        }

//        ex-4
        Integer array[]= new Integer[]{20, 30, 40};
        System.out.println("Original Array: "+Arrays.toString(array));
        int max_val = array[0];
        if(array[2] >= max_val)
            max_val = array[2];
        System.out.println("Larger value between first and last element :"+max_val);

//        ex-5
        int[] array_nums = {20, 30, 40};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        int x = array_nums[0];
        array_nums[0] = array_nums[array_nums.length-1];
        array_nums[array_nums.length-1] = x;
        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(array_nums));

//        ex-6
        String [] dict = {"cat", "dog", "red", "is", "am"};
        System.out.println("Original dictionary : "+Arrays.toString(dict));
        System.out.println("Longest word(s) of the above dictionary: "+longestWords(dict));

//  ex-7
        int ch;
        double ar;
//
        int length, breadth, height, diagonal1, diagonal2;
        int side;
        int radius;
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Right Angle Triangle");
        System.out.println("2: Area of Equilateral Triangle");
        System.out.println("3: Area of Square");
        System.out.println("4: Area of Rectangle");
        System.out.println("5: Area of Circle");
        System.out.println("6: Area of Rhombus");
        System.out.println("7: Program termination");
        lp : while(true)
        {
            System.out.print("Make your choice: ");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.print("Enter the height of Right Angle Triangle \n");
                    height = sc.nextInt();
                    System.out.print("Enter the base of Right Angle Triangle \n");
                    breadth = sc.nextInt();
                    ar = (height * breadth)/2;
                    System.out.println("Area of the Right Angle Triangle is " + ar + "\n\n");
                    break;
                case 2:
                    System.out.print("Enter the side of an Equilateral Triangle \n");
                    side = sc.nextInt();
                    ar=(side * side * Math.sqrt(3)) / 4;
                    System.out.println("Area of the Equilateral Triangle is " + ar + "\n\n");
                    break;
                case 3:
                    System.out.print("Enter the side of a Square \n");
                    side = sc.nextInt();
                    ar = side * side;
                    System.out.println("Area of the Square is "+ ar + "\n\n");
                    break;
                case 4:
                    System.out.print("Enter the length of a Rectangle \n");
                    length = sc.nextInt();
                    System.out.print("Enter the breadth of the Rectangle \n");
                    breadth = sc.nextInt();
                    ar = length * breadth;
                    System.out.println("Area of the Rectangle is " + ar + "\n\n");
                    break;
                case 5:
                    System.out.print("Enter the radius of a Circle \n");
                    radius = sc.nextInt();
                    ar = radius * radius * 22 / 7;
                    System.out.println("Area of the Circle is " + ar + "\n\n");
                    break;
                case 6:
                    System.out.print("Enter the first diagonal of a Rhombus \n");
                    diagonal1 = sc.nextInt();
                    System.out.print("Enter the second diagonal of the Rhombus \n");
                    diagonal2 = sc.nextInt();
                    ar = diagonal1 * diagonal2 * 1 / 2;
                    System.out.println("Area of the Rhombus is " + ar + "\n\n");
                    break;
                case 7:

                    break lp;
                default:
                    System.out.println("Invalid choice! Please make a valid choice. ");
            }
        }


//        ex-8

        int [] arr_num = new int [] {1,1,1,3,3,5};

        int [] fr = new int [arr_num.length];
        int visited = -1;

        for(int i = 0; i < arr_num.length; i++){
            int count = 1;
            for(int j = i+1; j < arr_num.length; j++){
                if(arr_num[i] == arr_num[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }


        System.out.println(" Element | Frequency");
        System.out.println("---------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr_num[i] + "    |    " + fr[i]);
        }


//         ex-9
        int n = 8;

        int _array[] = { 2,3,40,1,5,9,4,10,7 };

        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++) {
            if (_array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        int j = 0, k_ = 0;
        for (int i = 0; i < n; i++) {
            if (_array[i] % 2 == 0)
                even[j++] = _array[i];
            else
                odd[k_++] = _array[i];
        }
       printArray(odd );
        printArray(even );

//ex-10
        int a[] = { 2,3,6,6,4 };
        int b[] = {2,3,6,6,4};
        boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }




    }

    }






