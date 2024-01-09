package Apna_College_Java_DSA.Arrays._2_Auxiliary_Arrays;

class trappingWater{
    public static void main(String[] args) {
        int []height={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }

    public static int trappedRainWater(int height[]){
        int n = height.length;
        // calculate left max boundaries - array
        // calculate right max boundaries - array

        // above both arrays are auxiliary arrays
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1; i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //starting it from the last
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for (int i=0;i<n;i++){
            // waterLevel=min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = (waterLevel-height)*width [here width is 1]
            trappedWater += waterLevel-height[i];
        }

        return trappedWater;
    }
}