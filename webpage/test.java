import java.util.*;

class duplicate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = in.nextInt();

        int A[] = new int[size];

        int i,j,c=0;

        System.out.println("Enter " + size + " numbers");

        for(i = 0; i<size; i++)
        {
            A[i] = in.nextInt();
        }
//Arranging

        Arrays.sort(A);
        System.out.println("------------------------------------");//clear
      
      for( i =0 ;i<size-1;i++){
        if(A[i]!=A[i+1])
        {
            System.out.println(A[i]);
        
        }
   
      }

       if(A[size-1]!=A[size-2]){
        System.out.println(A[size-1]);
    }

      

          }
}
