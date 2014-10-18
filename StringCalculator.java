public class StringCalculator{
	public static void main(String []args) {
 		System.out.println(add(""));
		System.out.println(add("1,2,3"));
		System.out.println(add("1\n2,3"));
		System.out.println(add("3"));
		System.out.println(add("//#\n1,2,3#4"));
	}
		private static int  add(String numbers){
		try{
			String delimiter = "delimiter";
			if (numbers.length() > 2 && numbers.substring(0,2).equals("//"))
			{
				delimiter = numbers.substring(2,3);
				numbers = numbers.substring(4,numbers.length());
			}	
			if (numbers.length() == 0)
			{
				return 0;
			}
			else if (!numbers.contains(",") &&  !numbers.contains("\n") && !numbers.contains(delimiter))
			{
				return Integer.parseInt(numbers);
			}
			else
			{
				int count = numbers.length() - numbers.replace(",","").length();
				count = count + numbers.length() - numbers.replace("\n","").length();
				count = count + numbers.length() - numbers.replace(delimiter,"").length();
	
				int sum = 0;
				for (int i = 0; i < count; i++)
				{
					int commaIndex = numbers.indexOf(",");									
                                        int newLineIndex = numbers.indexOf("\n");
                                        int delimiterIndex = numbers.indexOf(delimiter);
										
					if (commaIndex == -1)
					{
						commaIndex = Integer.MAX_VALUE;
					}
					if (newLineIndex == -1)
					{
						newLineIndex = Integer.MAX_VALUE;
					}
					if (delimiterIndex == -1)
					{
						delimiterIndex = Integer.MAX_VALUE;
					}
									
							
					if (commaIndex < newLineIndex && commaIndex < delimiterIndex)
                                        {
                                                int x = Integer.parseInt(numbers.substring(0,commaIndex));
                                                sum = sum + x;
                                                numbers = numbers.substring(commaIndex+1, numbers.length());
                                        }
                                        else if (newLineIndex < commaIndex && newLineIndex < delimiterIndex)
                                        {
                                                int x = Integer.parseInt(numbers.substring(0,newLineIndex));
                                                sum = sum + x;
                                                numbers = numbers.substring(newLineIndex+1, numbers.length());
                                        }
					 else if (delimiterIndex < commaIndex && delimiterIndex < newLineIndex)
                                        {
                                                int x = Integer.parseInt(numbers.substring(0,delimiterIndex));
                                                sum = sum + x;
                                                numbers = numbers.substring(delimiterIndex+1, numbers.length());
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
