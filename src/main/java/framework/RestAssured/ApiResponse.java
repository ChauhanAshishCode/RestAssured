/**
 * 
 */
package framework.RestAssured;

import java.util.List;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * @author ashish.k1
 *
 */
public class ApiResponse {
	Response response;
	JsonPath jsonResponse;
	
	public ApiResponse(Response response) {
		if(response==null)
			throw new NullPointerException("response: null");
		this.response=response;
		jsonResponse= response.jsonPath();
	}
	
	
	public int getStatusCode() {
		return response.getStatusCode();
	}
	
	public JsonPath getJsonResponse() {
		return jsonResponse;
	}
	
	public String getValueOf(String key) {
		String result=null;
		if(key!=null)
			result=jsonResponse.getString(key);
		return result;
	}
	
	public List<String> getHeader(String headerName) {
		List<String> headerValue=null;
		if(headerName!=null)
			headerValue=response.getHeaders().getValues(headerName);
		return headerValue;
	}
	
	
}
