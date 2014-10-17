public class StringCalculator{
	public static void main(String []args) {
		System.out.println(Integer.toString(add("1,2")));
		System.out.println(Integer.toString(add("")));
		System.out.println(Integer.toString(add("1")));
		System.out.println(Integer.toString(add("-1")));
		System.out.println(Integer.toString(add("-2,-5")));
		System.out.println(Integer.toString(add("aron,1")));	
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
