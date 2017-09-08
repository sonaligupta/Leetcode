import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] solution=twoSum(nums,3);
        System.out.println(Arrays.toString(solution));

    }


    public static int[] twoSum(int[] nums,int target) {
            int[] indices ={0,0};
            for(int i =0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j] == target){

                        indices[0]=i;
                        indices[1]=j;

                    }

                }
            }
            return indices;

        }

}