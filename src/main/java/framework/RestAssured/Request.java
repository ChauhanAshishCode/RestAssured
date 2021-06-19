package framework.RestAssured;

import java.util.Map;

import io.restassured.response.Response;

public class Request {
	
	public Response hitRequest(String requestMethod,String requestUrl, Map<String,Object>queryParams) {
		Response response=null;
		if(requestMethod.equalsIgnoreCase("GET")) {
			GetRequest getRequest= new GetRequest(requestUrl,queryParams);
			try {
				response=getRequest.hitRequest();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			if(requestMethod.equalsIgnoreCase("Post")) {
				
			}
		}
		return response;
	}
	
	public Response hitRequest(String requestMethod,String requestUrl) {
		Response response=null;
		if(requestMethod.equalsIgnoreCase("GET")) {
			GetRequest getRequest= new GetRequest(requestUrl);
			try {
				response=getRequest.hitRequest();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			if(requestMethod.equalsIgnoreCase("Post")) {
				
			}
		}
		return response;
	}
}
