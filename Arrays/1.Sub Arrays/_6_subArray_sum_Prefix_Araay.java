package Apna_College_Java_DSA.Arrays;

public class _6_subArray_sum_Prefix_Araay {
    public static void main(String[] args) {
        int[] arr = { 1,-2,6,-1,3 };
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        
        //calc prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
