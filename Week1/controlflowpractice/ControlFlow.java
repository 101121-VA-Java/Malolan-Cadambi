package controlflowpractice;

public class ControlFlow{

    public static void main(String[] args){
        int[] intArr = {4, 3, 5};
        int[] intArr1 = {1, 3, 5, 6};
        System.out.println("Here are some test cases, feel free to write more:");
        System.out.println("--------------------------------------------------");
        System.out.println("Sum:");
        System.out.println("Expected value: 12  |   Actual: " + sum(intArr));
        System.out.println("Expected value: 15  |   Actual: " + sum(intArr1));
        System.out.println("--------------------------------------------------");
        System.out.println("echo:");
        System.out.println("Expected value: Hello Hello  |   Actual: " + echo("Hello", 2));
        System.out.println("Expected value: World World World  |   Actual: " +  echo("World", 3));
        System.out.println("--------------------------------------------------");
        System.out.println("isEven:");
        System.out.println("Expected value: false  |   Actual: " + isEven("Hello"));
        System.out.println("Expected value: true  |   Actual: " +  isEven("World!"));
        System.out.println("--------------------------------------------------");
        System.out.println("transformIntArr:");
        System.out.println("Expected value:");
        System.out.println("4 6 5");
        System.out.println("Actual:");
        for(int i : transformIntArr(intArr)){
            System.out.print(i + " ");
        } 
        System.out.println("\nExpected value:");
        System.out.println("1 6 5 12");
        System.out.println("Actual:");
        for(int i : transformIntArr(intArr1)){
            System.out.print(i + " ");
        } 
        System.out.println("\n--------------------------------------------------");
        System.out.println("orderArr:");
        System.out.println("Expected value:");
        System.out.println("3 4 5");
        System.out.println("Actual:");
        for(int i : orderArr(intArr)){
            System.out.print(i + " ");
        } 
        System.out.println("\nExpected value:");
        System.out.println("1 3 5 6");
        System.out.println("Actual:");
        for(int i : orderArr(intArr1)){
            System.out.print(i + " ");
        } 

    }

    /*
     This method should return the sum of all of the element of an array of integer.
     */
    public static int sum(int[] intArr){
         // logic
        int res = 0;
        for(int i = 0; i < intArr.length; i++){
            res = res + intArr[i];
        }
        return res;
    }

    /*
     This method should return a string composed of the word multiplied by the number of time and separated by a space.
     */
    public static String echo(String word, int times){
        // logic
        String x = "";
        for(int i = 0; i < times; i++){
            if (i == times -1){
                x = x + word;
            }
            else{
                x = x + word + " ";
            }
        }
        return x;
    }

    /*
    This method should return true if the number of character in the string even, or false if it's odd.
    */
    public static boolean isEven(String s){
        // logic
        boolean bo = true;
        if(s.length() % 2 == 0){
            bo = true;
        }
        else{
            bo = false;
        }
        return bo;
    }

    /*
    This method should return an array of integer where all of the elements have been multiplied by 2 if they are a multiple of 3.
    */
    public static int[] transformIntArr(int[] intArr){
        // logic
        int[] repArr = new int[intArr.length];
        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] % 3 == 0){
                repArr[i] = intArr[i] * 2;
            }
            else{
                repArr[i] = intArr[i];
            }
        }        
        return repArr;
    }

    /*
    This method should return the same array of integer ordered from least to most.
    */
    public static int[] orderArr(int[] intArr){
        // logic
        //int[] srtArr = new int[intArr.length];
        int srt;
        for(int i = 0; i < intArr.length - 1; i++){
            if(intArr[i] > intArr[i + 1]){
                srt = intArr[i];
                intArr[i] = intArr[i + 1];
                intArr[i + 1] = srt;
                i = -1;
            }
        }
        return intArr;
    }
}