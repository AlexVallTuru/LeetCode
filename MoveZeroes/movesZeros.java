class movesZeros {

    public static void main(String[] args) {

        System.out.println("Hello Zeroes!");

        moveZeroes(new int[]{0,1,0,3,12});

    }

    public static void moveZeroes(int[] nums) {

        int pos = 0;

        for(int i = 0; i<= nums.length-1; i++){
            if(nums[i] != 0){
                nums[pos] = nums[i];
                pos++;                
            }
        }
        for(int i = pos; i <= nums.length -1; i++){
            nums[i] = 0;
        }

    }

}