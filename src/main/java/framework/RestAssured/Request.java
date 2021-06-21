package framework.RestAssured;

import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.response.Response;

public class Request {
	
	public Response hitGetRequest(String requestMethod,String requestUrl, Map<String,Object>queryParams) {
		Response response=null;
		
			GetRequest getRequest= new GetRequest(requestUrl,queryParams);
			try {
				response=getRequest.hitRequest();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		return response;
	}
	
	public Response hitGetRequest(String requestMethod,String requestUrl) {
		Response response=null;
		
			GetRequest getRequest= new GetRequest(requestUrl);
			try {
				response=getRequest.hitRequest();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return response;
	}
	
	public Response hitPostRequest(Map<String,Object>headersMap,String requestUrl,JSONObject requestParams) {
		Response response=null;
		PostRequest postRequest=new PostRequest(headersMap,requestUrl,requestParams);
		try {
			response=postRequest.hitRequest();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
