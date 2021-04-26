
public class Test {
	static int minJumps(int arr[]) ///function to find min height of tree
	{
		if (arr.length <= 1)
			return 0;

	
	if (arr[0] == 0)
			return -1;
		int maxReach = arr[0];
		int step = arr[0];
		int jump = 1;

		
		for (int i = 1; i < arr.length; i++) {
	
			if (i == arr.length - 1)
				return jump;

			maxReach = Math.max(maxReach, i + arr[i]);

		
			step--;

		
			if (step == 0) {
			
				jump++;

	
				if (i >= maxReach)
					return -1;

				step = maxReach - i;
			}
		}

		return -1;
	}


	public static void main(String[] args)
	{
		int arr[] = new int[] { 1, 3,  46, 18, 9 };

///    here i am calling the function

		System.out.println(minJumps(arr));
	}
}
