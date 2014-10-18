public class StringCalculator{
	public static void main(String []args) {
 		
	}
		private static int  add(String numbers){
		try{		
			if (numbers.length() == 0)
			{
				return 0;
			}
			else if (!numbers.contains(",") &&  !numbers.contains("\n"))
			{
				return Integer.parseInt(numbers);
			}
			else
			{
				int count = numbers.length() - numbers.replace(",","").length();
				count = count + numbers.length() - numbers.replace("\n","").length();
					
				int sum = 0;
				for (int i = 0; i < count; i++)
				{
					int index = numbers.indexOf(",");
					int index2 = numbers.indexOf("\n");
					if ((index < index2 && index != -1) || (index2 == -1)) 
					{ 
						int x = Integer.parseInt(numbers.substring(0,index));
				 		sum = sum + x;
						numbers = numbers.substring(index+1, numbers.length());
					}
					else if ((index2 < index && index2 != -1) || (index == -1))
					{
						int x = Integer.parseInt(numbers.substring(0,index2));
                                                sum = sum + x;
                                                numbers = numbers.substring(index2+1, numbers.length());	
					}
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
