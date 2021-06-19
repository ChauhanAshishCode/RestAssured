package framework.RestAssured;

public class GetRequestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://project-service.99.jsb9.net/project-web-service/v4/project-units?"
				+ "filter=projectUnit.projectUnitId=in=(6588);projectUnit.primarySaleType==RESIDENTIAL;projectUnit.entityType==PROJECT";
		Request request=new Request();
		ApiResponse response=new ApiResponse(request.hitRequest("GET", url));
		System.out.println(response.getStatusCode());
		System.out.println(response.getValueOf("projectUnits[0].amenities[2]"));
	}

}
