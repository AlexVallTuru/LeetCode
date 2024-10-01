//package CanPlaceFlowers;

public class canPlaceFlowers {
    
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
    }
    
    public static boolean canPlaceFlower(int[] flowerbed, int n) {
        
        int len = flowerbed.length;
        if(n == 0){
            return true;
        }
        if(len == 1 && flowerbed[0] == 0 && n <= 1) {
            return true;
        }

        if(len >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
            if(n == 0){
                return true;
            }
        }
        if(flowerbed[len-1] == 0 && flowerbed[len-2] == 0){
            flowerbed[len-1] = 1;
            n--;
            if(n == 0){
                return true;
            }
        }
        for (int i = 2; i < len; i++) {
        
            if(flowerbed[i-2] == 0 && flowerbed[i-1] == 0 && flowerbed[i] == 0){
                flowerbed[i-1] = 1;
                n--;
            }
            if(n == 0){
                return true;
            }
        }
        return false;
    }

}
