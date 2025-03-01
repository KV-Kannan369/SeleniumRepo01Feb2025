package week3.day2.homeassignment;

public class WebElement {
	
	public void click() {
		System.out.println("Click method from Baseclass-Webelement");
	}
	public void setText(String text) {
		
		String name = text;
		
		System.out.println("String text: "+name);
		System.out.println("String text: =====>"+text);
	}

}
