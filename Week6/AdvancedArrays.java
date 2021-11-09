package Week6;

import java.util.Arrays;
import java.util.Random;

public class AdvancedArrays {
    // Given an Array return true if 9 appears as first or last element 
    // of the array
    // EX. frontEnd([1,3,4,9]) -> true

    public static boolean frontEnd(int [] nums){
        return nums[0] == 9 || nums[nums.length - 1] == 9;
    }


    // Given an int array if there is a 9 follwed by a 1 and then a 1 return 
    // The police are on their way 

    public static int[] Call911(int[] nums){
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 9 && nums[i+1] == 1){
                if(nums[i+2] == 1){
                    System.out.println("The police are on their way");
                }else if(nums[i+2] != 1){
                    System.out.println("Dialing the number:");
                }
                break;
            }
        }
        return nums;
    }

    public static String revString(String str){
        String newString = "";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
          ch= str.charAt(i); //extracts each character
          newString= ch+newString; //adds each character in front of the existing string
        }
        return newString;
    }

    public static String revStringnew(String str){

 
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        int p = sbr.length();
        int q = sbr.capacity();
        System.out.println("Length if String=" + p);
        System.out.println("Capacity of String=" + q);
        // To reverse the string
        // sbr.replace(5, 8, "are");
        // sbr.insert()
        // sbr.setCharAt(0,'s');
        // System.out.println(sbr); 
        sbr.reverse();
        System.out.println(sbr);

        return sbr.toString();
    }

    public static String reverseArray(String str)
    {
        // return if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
        // get string length
        int n = str.length();
        // create a character array of the same size as that of string
        char[] temp = new char[n];
        // fill character array backward with characters in the string
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }
        // convert character array to string and return it
        return String.copyValueOf(temp);
    }

    public static int[] list() {
        Random rand = new Random();
        int[] anArray = new int[10];
        for(int i=0;i<anArray.length;i++)
        {
            anArray[i] = rand.nextInt(2);
        }
        return anArray;
    }

    public static void main(String[] args) {
        int[] nums = { 
            1, 2, 3,
            4, 5, 6, 
            7, 8, 9
            };
        int[] phoneNumber = {7,3,2,4,3,2,9,1,2};
        System.out.println(frontEnd(nums));

        int[] x = Call911(phoneNumber);
        System.out.println(Arrays.toString(x));
        //Arrays.stream(x).forEach(System.out::println);
        System.out.println(revString("Test"));
        System.out.println(revStringnew("great"));
        System.out.println(reverseArray("escape"));

        // for (int i : list()) {
        //     System.out.println(i); 
        // }
        int [] z = list();
        System.out.println(Arrays.toString(z));
        
    }
}
