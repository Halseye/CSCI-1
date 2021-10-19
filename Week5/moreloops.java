package Week5;

public class moreloops {

    public static String everyNth(String str, int n) {
        String result = "";
        for (int i=0; i<str.length(); i = i + n){
          result = result + str.charAt(i);
        }
        return result;
    }
    //Given a string, return a string where for every char in the original, there are two chars.
    public static String doubleChar(String str){
        String result = "";
          for (int i = 0; i <=str.length()-1;i++) {
            result += str.charAt(i);
            result += str.charAt(i); }
            return result;
    }
    //Count the number of times XX is in a given string
    public static int countXX(String str){
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
          if (str.substring(i, i+2).equals("xx")){ 
          count++;
          }
        }
        return count;
    }
    // given a string create a new string that will move the first char to the end of the following 2 chars
    // EX.
    //oneTwo("abc") → "bca"
    //oneTwo("tca") → "cat"
    //oneTwo("tcagdo") → "catdog"
    public static String oneTwo(String str){
        String result = "";
        for(int i=0; i <str.length()-2; i += 3)
        {
            result = result + str.substring(i+1,i+3) + str.charAt(i);
        }
        return result;
    }

      public static void main(String[] args) {
          System.out.println(everyNth("tester", 2));
          System.out.println(doubleChar("tester"));
          System.out.println(countXX("asdjfasioXXaksjdklasxxklasjdiosaxx"));
          System.out.println(oneTwo("tacocat"));
      }
      
    
}
