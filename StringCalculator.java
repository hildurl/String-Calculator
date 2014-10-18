public class StringCalculator{
	public static void main(String []args) {
			
	}
	private static int  add(String numbers){
		try{		
			if (numbers.length() == 0)
			{
				return 0;
			}
			else if (!numbers.contains(","))
			{
				return Integer.parseInt(numbers);
			}
			else
			{
				int index = numbers.indexOf(","); 
				int x = Integer.parseInt(numbers.substring(0,index));
				int y = Integer.parseInt(numbers.substring(index+1,numbers.length())); 
				return x + y;
			}
		} catch(NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
