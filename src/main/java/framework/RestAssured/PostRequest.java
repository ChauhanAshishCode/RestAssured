package framework.RestAssured;

import java.util.Map;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {
	
	private Map<String,Object> headersMap;
	private String url;
	private JSONObject requestBody;
	
	public PostRequest(Map<String,Object> headersMap,String url,JSONObject requestBody) {
		this.headersMap=headersMap;
		this.url=url;
		this.requestBody=requestBody;
	}
	
	@SuppressWarnings("unchecked")
	public Response hitRequest() throws Exception{
		Response response=null;
		if(headersMap!=null && url!=null && requestBody!=null && headersMap.get("Content-Type").toString().equalsIgnoreCase("application/json")) {
			response= RestAssured.given().headers(headersMap).body(requestBody.toJSONString()).when().post(url);
		}
		return response;
	}
}
