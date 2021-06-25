package edu.cnm.deepdive;

/*
Given an array of ints, return true if the array contains two 7's next to each other, or there are
two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 */

public class CodingBatHasSeventyseven {

  private static int[] one = {1, 7, 7};
  private static int[] two = {1, 7, 1, 7};
  private static int[] three = {1, 7, 1, 1, 7};

  public static void main(String[] args) {
    System.out.println("with the array [1, 7, 7], the outcome is " + has77(one) + ".");
    System.out.println("with the array [1, 7, 1, 7], the outcome is " + has77(two) + ".");
    System.out.println("with the array [1, 7, 1, 1, 7], the outcome is " + has77(three) + ".");
  }

  public static boolean has77(int[] nums) {

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 7 && (nums[i + 1] == 7
          || (i < (nums.length - 2) && nums[i + 2] == 7))) {
        return true;
      }
    }
    return false;
  }

}
