
public class Exception_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	        System.out.print("E");

	

	}

}
