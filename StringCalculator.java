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
				int count = numbers.length() - numbers.replace(",","").length();
				System.out.println(count + "");
				int sum = 0;
				for (int i = 0; i < count; i++)
				{
					int index = numbers.indexOf(","); 
					int x = Integer.parseInt(numbers.substring(0,index));
				 	sum = sum + x;
					numbers = numbers.substring(index+1, numbers.length());
				}
				sum = sum + Integer.parseInt(numbers);
				
				return sum;
			}
		} catch(NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
