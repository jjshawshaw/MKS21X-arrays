public class ArrayDemo{
  public static void main(String[] args){
    int[] testArray = {0, 1, 2, 3};
    printArray(testArray);
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
}
