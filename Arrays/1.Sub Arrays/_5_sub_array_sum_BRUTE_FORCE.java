package Apna_College_Java_DSA.Arrays;

public class _5_sub_array_sum_BRUTE_FORCE {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            for(int j=i; j<arr.length; j++){
                currSum = 0;
                for (int k=i; k<=j; k++){
                    //subarr sum
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }

        System.out.println("Maximum sum is: "+maxSum);
    }
}

    
    
