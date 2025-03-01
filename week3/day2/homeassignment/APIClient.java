package week3.day2.homeassignment;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("EndPoint: "+endpoint);
		
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("EndPoint: ======>"+endpoint+" RequestBody:=====>"+requestBody+" RequestStatus: "+requestStatus);
	}

	public static void main(String[] args) {

		APIClient api = new APIClient();
		api.sendRequest("https://www.google.com");
		api.sendRequest("https://www.gmail.com", "Kannan,Chennai", true);
	}

}
