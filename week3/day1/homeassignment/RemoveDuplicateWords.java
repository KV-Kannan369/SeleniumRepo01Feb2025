package week3.day1.homeassignment;

public class RemoveDuplicateWords {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		int count = 0;
		for(int i=0;i<textArray.length;i++) {
			for(int j=i+1;j<textArray.length;j++)
			{
				if(textArray[i].equalsIgnoreCase(textArray[j]))
				{
					count = count + 1;
					if(count>1)
					{
						textArray[i] = "";
					}
					
				}
			}
		}
		for (int i = 0; i < textArray.length; i++) {
			System.out.println(textArray[i]);
		}
		
		
	}

}
