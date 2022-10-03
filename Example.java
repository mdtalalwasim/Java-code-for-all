//how to create Custom exception...

class AgeInvalidException extends Exception{

		Exception e = new Exception();

		AgeInvalidException(){
			super("Age is Invalid !!");
		}

		AgeInvalidException(String message){
			super(message);

		}
}


class Example{
	public static void main(String[] args) {

		System.out.println("Started...");//starting program
		
		
		try{
		//possibility error:error prone statements	
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt (args[1]);
		System.out.println("We have got two numbers : ");
		int result = n1/n2;
		System.out.println("Divisionn is "+result);

		if (n2<10) {
			throw new AgeInvalidException("Your age is INVALID !!");
		}

		}catch(ArithmeticException e){

			//handling code
			System.out.println("n2 can not be 0 !!");
			System.out.println(e.getMessage());
		}

		catch (NumberFormatException e) {
			System.out.println("Invalid Numbers !!");
			System.out.println(e.getMessage());	
		}

		catch(AgeInvalidException e){
			System.out.println("Invalid N2 Value !!");
			System.out.println(e.getMessage());

		}

		catch (Exception e) {
			System.out.println("Error !");
			System.out.println(e.getMessage());
		}

		finally{
			System.out.println("I'm finally block!");
			System.out.println("closing all resources...");
		}
		

		System.out.println("Program is Terminated..."); //ending point

	}
}