
public class array2 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		
		int val = 18;
	    for (int i=0;i<arr.length;i++){
	    	if (arr[i] == val) {
	    		System.out.println(true);
	    		break;
	    	}
	    	else if(i+1 == arr.length) {
	    		System.out.println(false);
	    		break;
	    	}
	    }

	}

}
