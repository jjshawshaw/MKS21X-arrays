public class ArrayDemo{
  public static void main(String[] args){
    int[] testArray1 = {0, 1, 2, 3};
    int[][] testArray2 = {
      {0, 1, 2, 3},
      {4, 5, 6, 7}
    };
    printArray(testArray1);
    printArray(testArray2);
  }
  public static void printArray(int[] ary){
    String output = "{";
    for (int i = 0; i < ary.length; i++) {
      output += "" + ary[i];
      if (i < ary.length - 1) output += ", ";
    }
    output += "}";
    System.out.println(output);
  }
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
}
