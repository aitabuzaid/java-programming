package leetcode;

public class IsBadVersion {
	
	public int firstBadVersion(int n) {
        int min = 0, max = n, mid = (max+min)/2;
        
        while (min < max-1){
            //System.out.println(mid);
            if (isBadVersion(mid))
                max = mid;
            else
                min = mid;
            
            mid = min + (max-min)/2;
        }
        return max;
    }

	private boolean isBadVersion(int mid) {
		// unknown implmentation
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
