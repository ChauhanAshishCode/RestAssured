package framework.RestAssured;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class GetAndPostRequestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://project-service.99.jsb9.net/project-web-service/v4/project-units?"
				+ "filter=projectUnit.projectUnitId=in=(6588);projectUnit.primarySaleType==RESIDENTIAL;projectUnit.entityType==PROJECT";
		String postUrl="https://reqbin.com/echo/post/json";
		@SuppressWarnings("unchecked")
		Map<String,Object>requestParamsMap=new HashMap();
		requestParamsMap.put("Id",78912);
		requestParamsMap.put("Customer","Jason Sweet");
		requestParamsMap.put("Quantity", 1);
		requestParamsMap.put("Price", 18.00);
		JSONObject requestBody= new JSONObject(requestParamsMap);
		Request request=new Request();
		ApiResponse response=new ApiResponse(request.hitGetRequest("GET", url));
		System.out.println(response.getStatusCode());
		System.out.println(response.getValueOf("projectUnits[0].amenities[2]"));
		Map<String,Object> headersMap=new HashMap();
		headersMap.put("Content-Type", "application/json");
		response=new ApiResponse(request.hitPostRequest(headersMap, postUrl, requestBody));
		System.out.println(response.response.getBody().asString());
	}

}
