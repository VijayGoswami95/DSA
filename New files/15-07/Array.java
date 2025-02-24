// arr1={2,3,4,5,6}
// arr2= {2,3,4,5,6}
// Take 2 array check if both array are equal 
// Megre both array
// factorial of each element in the array
// square of each element;

public class array {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,6};
        int arr2[]= {1,2,3,4,6};
        int count =0;
        if (arr.length==arr2.length) {
            for(int i = 0; i<arr.length;i++)
            {
                if(arr[i]==arr2[i])
                {
                    count++;
                }
            }
            if (count>0) {
                System.out.println("Both Array are equal");
            }
            else
            {
                System.out.println("Both array are not equal");
            }
        }
        else{
            System.out.println("Array size is not equal");
        }
    }
}
