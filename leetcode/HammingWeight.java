package leetcode;

public class HammingWeight {
	
	public int hammingWeight(int n) {
        int count = 0;
        if (n < 0){
            n = n & Integer.MAX_VALUE;
            count++;
        }
            
        for (int i = 0; i < 32; i++){
            //System.out.println(n);
            if (n%2 == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
