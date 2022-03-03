import java.util.Scanner;  

public class sort  
{ 
    public static void main (String[] args)  
    {          
      Scanner input = new Scanner(System.in);
      int total_length;
      System.out.println("Enter Array size");
      total_length = input.nextInt();    
      int [] number_list = new int[total_length]; 
      System.out.println("Enter"+total_length+"Values");
      sort st = new sort();
      for (int i = 0; i < total_length; i++) 
         {
            number_list[i] = input.nextInt();     
         }
      
      st.merge(number_list,total_length);   
}

    public void merge(int[] arr,int arr_length){
         int temp=0;
          for(int i=0; i < arr_length; i++){  
                 for(int j=1; j < (arr_length-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
          }
  
         System.out.println("Sorted Array = ");
         for(int j=0;j<arr_length;j++){
            System.out.println(arr[j]);
         }
      
    }
}
