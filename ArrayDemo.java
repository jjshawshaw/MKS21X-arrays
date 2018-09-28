public class ArrayDemo{

  // test function calls
  public static void main(String[] args){
    int[] testArray1 = {0, 1, 2, 3};
    int[][] testArray2 = {
      {0, 1, 2, 3},
      {4, 5, 6, 7}
    };
    int[][] testArray3 = {
      {0, 1, 2, 0},
      {4, 0, 6, 7}
    };
    int[][] testArray4 = {
      {0, -1, 2, 0},
      {4, 0, 6, -7}
    };
    //printArray(testArray1);
    //printArray(testArray2);
    //System.out.println(countZeros2D(testArray3));
    //fill2D(testArray3);
    //printArray(testArray3);
    printArray(fill2DCopy(testArray4));


  }

  // print 1d array
  public static void printArray(int[] ary){
    String output = "{";
    for (int i = 0; i < ary.length; i++) {
      output += "" + ary[i];
      if (i < ary.length - 1) output += ", ";
    }
    output += "}";
    System.out.println(output);
  }
  // print 2d array
  public static void printArray(int[][]ary){
    String output = "";
    for (int i = 0; i < ary.length; i++) {
       String lineOutput = "{";
       for (int x = 0; x < ary[i].length; x++) {
         lineOutput += "" + ary[i][x];
         if (x < ary[i].length - 1) lineOutput += ", ";
       }
      lineOutput += "}\n";
      output += lineOutput;
    }
    System.out.println(output);
  }

  // count zeroes in 2d array
  public static int countZeros2D(int[][] nums){
    int output = 0;
    for (int i = 0; i < nums.length; i++) {
       for (int x = 0; x < nums[i].length; x++) {
         if (nums[i][x] == 0) output += 1;
       }
     }
    return output;
  }

// Replace all the of values with 1's
// EXCEPT when the row number is the same as the column number:
// you must fill those with 3's instead.
  public static void fill2D(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
       for (int x = 0; x < vals[i].length; x++) {
         if (i != x) vals[i][x] = 1;
         else vals[i][x] = 3;
       }
    }
  }

// Create new array except all negatives are changed to 3
  public static int[][] fill2DCopy(int[][] vals){
    int[][] output = new int[vals.length][];
    for (int i = 0; i < vals.length; i++) {
      output[i] = new int[vals[i].length];
       for (int x = 0; x < vals[i].length; x++) {
         if (vals[i][x] < 0) output[i][x] = 3;
         else output[i][x] = 1;
       }
     }
     return output;
   }

}
