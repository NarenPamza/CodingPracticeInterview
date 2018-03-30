class FindDuplicate
{
    void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for (i = 0; i < size; i++)
        {
        	
            if (arr[Math.abs(arr[i])] >= 0){
            	
            	System.out.println("Start -- "+ arr[i]);
            	System.out.println(Math.abs(arr[i]));
            	
            	arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else{
            	
            	System.out.println(Math.abs(arr[i]) + " Answer --->");
            }
            
            System.out.println("End----");
        }         
    } 
 
    /* Driver program to test the above function */
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        duplicate.printRepeating(arr, arr_size);
        
        char a = 'b';
        int ascii = a;
        
        System.out.println(ascii);
    }
}