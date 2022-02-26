
public class Exception_Demo2 {
	public static void main(String ar[])
	{
	 try 
     {
         System.out.print("A");
         int num = 99/0;
         System.out.print("B");
         System.out.println("Print :" +num);
     }
     catch(ArithmeticException ex) 
     {
         System.out.print("C");
     }
     catch(Exception ex)
     {
         System.out.print("D");
     }
     finally
     {
         System.out.print("E");
     }  
	}

}
