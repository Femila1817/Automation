package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.util.TestUtil;

public class GetApiTest extends TestBase{
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closablehttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		url = serviceUrl + apiUrl;			
	}
	
	@Test(priority=1)
	public void getApiTestwithoutHeader() throws ClientProtocolException, IOException, java.lang.Exception{
		restClient = new RestClient();
		closablehttpResponse = restClient.get(url);
		
		int statuscode = closablehttpResponse.getStatusLine().getStatusCode();
		
		//a. Status Code
		System.out.println("Status Code : " + statuscode);
		
		Assert.assertEquals(statuscode,RESPONSE_STATUS_CODE_200,"Status code is other than 200");
		
		//b.Json String
		String responseString = EntityUtils.toString(closablehttpResponse.getEntity(), "UTF8");
		
		JSONObject responseJson = new JSONObject(responseString);
		
		System.out.println("Response Json from API : " +responseJson);
		
		String perPageValue = TestUtil.getValueByJPath(responseJson, "/per_page");
		System.out.println("Perpage data : " + perPageValue);
		
		//Single Value Assertion
		
//		Integer perPageAssert = 3;
//		Assert.assertEquals(Integer.valueOf(perPageValue), perPageAssert, "Per page Value did not match");
		
	
		Assert.assertEquals(Integer.parseInt(perPageValue), 3, "Per page Value did not match");

		String totalValue = TestUtil.getValueByJPath(responseJson, "/total");
		System.out.println("Total data : " + totalValue);
		
//		Integer perPagetotal = 12;
//		Assert.assertEquals(Integer.valueOf(perPageValue), perPageAssert, "total  Value did not match");
		
		Assert.assertEquals(Integer.parseInt(totalValue), 12, "total  Value did not match");
		
		
		//Get value from Json Array::
		
		String lastName = TestUtil.getValueByJPath(responseJson, "/data[0]/last_name");
		String id = TestUtil.getValueByJPath(responseJson, "/data[0]/id");
		String avatar = TestUtil.getValueByJPath(responseJson, "/data[0]/avatar");
		String firstName = TestUtil.getValueByJPath(responseJson, "/data[0]/first_name");
		String email = TestUtil.getValueByJPath(responseJson, "/data[0]/email");
		
		System.out.println("LastName : " + lastName);
		System.out.println("ID : " + id);
		System.out.println("Avatar : " + avatar);
		System.out.println("FirstName : " + firstName);
		System.out.println("Email : " + email);
		
				
		//c. all header
		Header[] headerArray = closablehttpResponse.getAllHeaders();
		
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		
		for(Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("Headers Array : " +allHeaders);
		
	}
	
	@Test(priority=2)
	public void getApiTestwithHeader() throws ClientProtocolException, IOException, java.lang.Exception{
		restClient = new RestClient();
		
		
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type","application/json");
		//headerMap.put("Authorization","Bearer fsgjskdgnsdbjgdsbd4r35t7vfbdshvbscdmnfdsbvhbdf");
		//headerMap.put("x-api-key","73ytyhfsbgbfndsbnjvnfsdkjh");
		//headerMap.put("username","admin");
		//headerMap.put("password","admin@123");'
		
		closablehttpResponse = restClient.get(url, headerMap);
		
		int statuscode = closablehttpResponse.getStatusLine().getStatusCode();
		
		//a. Status Code
		System.out.println("Status Code : " + statuscode);
		
		Assert.assertEquals(statuscode,RESPONSE_STATUS_CODE_200,"Status code is other than 200");
		
		//b.Json String
		String responseString = EntityUtils.toString(closablehttpResponse.getEntity(), "UTF8");
		
		JSONObject responseJson = new JSONObject(responseString);
		
		System.out.println("Response Json from API : " +responseJson);
		
		String perPageValue = TestUtil.getValueByJPath(responseJson, "/per_page");
		System.out.println("Perpage data : " + perPageValue);
		
		//Single Value Assertion
		
//		Integer perPageAssert = 3;
//		Assert.assertEquals(Integer.valueOf(perPageValue), perPageAssert, "Per page Value did not match");
		
	
		Assert.assertEquals(Integer.parseInt(perPageValue), 3, "Per page Value did not match");

		String totalValue = TestUtil.getValueByJPath(responseJson, "/total");
		System.out.println("Total data : " + totalValue);
		
//		Integer perPagetotal = 12;
//		Assert.assertEquals(Integer.valueOf(perPageValue), perPageAssert, "total  Value did not match");
		
		Assert.assertEquals(Integer.parseInt(totalValue), 12, "total  Value did not match");
		
		
		//Get value from Json Array::
		
		String lastName = TestUtil.getValueByJPath(responseJson, "/data[0]/last_name");
		String id = TestUtil.getValueByJPath(responseJson, "/data[0]/id");
		String avatar = TestUtil.getValueByJPath(responseJson, "/data[0]/avatar");
		String firstName = TestUtil.getValueByJPath(responseJson, "/data[0]/first_name");
		String email = TestUtil.getValueByJPath(responseJson, "/data[0]/email");
		
		System.out.println("LastName : " + lastName);
		System.out.println("ID : " + id);
		System.out.println("Avatar : " + avatar);
		System.out.println("FirstName : " + firstName);
		System.out.println("Email : " + email);
		
				
		//c. all header
		Header[] headerArray = closablehttpResponse.getAllHeaders();
		
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		
		for(Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("Headers Array : " +allHeaders);
		
	}
}
