
class ArrayExample {
   public static void main(String[] args) {

      
// Create an array for 10 numbers 1 to 10
	int[] nums = new int[10];

// Initialize array with numbers 1 to 10 using a for-loop
// accessing the elements of the specified array 

for (int i = 0; i < nums.length; i++)
    nums[i] = i + 1;  // +1 since we want 1-10 and not 0-9
    

for (int i = 0; i < nums.length; i++) 
/**         System.out.println("Element at index " + i +  
                                      " : "+ nums[i]);
*/           
      
	{
            if (nums[i]%2==0)
                System.out.println("Even numbers" + i +": "+ nums[i]); 
	} 


}

}
