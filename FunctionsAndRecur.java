import java.util.*;

public class MyClass {
    public List<Integer> rightDigit(List<Integer> list) {
        list.replaceAll(i -> i%10);
        return list;
    }
    public List<Integer> doubling(List<Integer> list) {
        list.replaceAll(i -> i*2);
        return list;
    }
    public List<String> removeX(List<String> list) {
  list.replaceAll(s -> s.replace("x",""));
  return list;
}

public boolean groupSumClump(int start, int[] nums, int target)
{
	if(start >= nums.length)
 	{
		if(target == 0)
  		return true;
  	return false;
 	}
 	int i = start + 1;
 	for(;  i < nums.length && nums[start] == nums[i]; i++);
 	if(groupSumClump(i, nums, target - ((i - start) * nums[start])))
 		return true;
 	return groupSumClump(i, nums, target);	
}
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
    }
}