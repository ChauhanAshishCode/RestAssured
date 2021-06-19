/**
 * 
 */
package framework.RestAssured;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;

/**
 * @author ashish.k1
 * 
 *
 */
public class GetRequest {
	
	String url;
	Map<String,Object> queryParams=new HashMap();
	public GetRequest(String url,Map<String,Object>queryParams){
		this.url=url;
		this.queryParams=queryParams;
	}
	
	public GetRequest(String url) {
		this.url=url;
	}
	
	public Response hitRequest() throws Exception{
		Response response=null;
		if(queryParams.size()==0) {
			response=RestAssured.given().when().get(url);
		}
		else {
			response=RestAssured.given().when().get(url, queryParams);
		}
		System.out.println("URL: "+url);
		System.out.println("Above URL hitted");
		return response;
		
	}
}
