public class TwoSum {

    public static void main(String[] args) {
        
        int[] position = new int[]{2,7,11,15};
        int[] result = twoSum(position, 9);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        
        int[] position = new int[2];

        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums.length; j++){

                if(nums[i]+nums[j] == target && i != j){
                    position[0] = i;
                    position[1] = j; 
                    return position;
                }

            }
        }
        return position;
    }

}