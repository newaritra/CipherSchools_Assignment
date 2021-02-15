public class InitializeDynamicArray  
{  
public static void main(String[] args)   
{  
int array[];  
array= new int[6];  
 
array[0] = 34;  
array[1] = 90;  
array[2] = 12;  
array[3] = 22;  
array[4] = 9;  
array[5] = 27;  
System.out.print("Elements of Array are: ");  

for(int i=0; i< array.length ; i++)   
{  
System.out.print(array[i] +" ");  
}  
}  
}