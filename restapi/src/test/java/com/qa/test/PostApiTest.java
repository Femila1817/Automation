package com.qa.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.Users;

public class PostApiTest extends TestBase{
	
	
	TestBase testBase;
	String postserviceURL;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closablehttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		postserviceURL = prop.getProperty("URL");
		apiUrl = prop.getProperty("postserviceURL");
		url = postserviceURL + apiUrl;			
	}
	
	
	@Test
	public void postApiTest() throws JsonGenerationException, IOException{
		restClient = new RestClient();
		HashMap<String, String> headerPostMap = new HashMap<String, String>();
		headerPostMap.put("Content-Type","application/json");
		
		//one utility to converts the java object to json.. here, users class to jason-- utility name is jackson
		
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("morpheus", "leader");
		
		//java object to json file
		
		mapper.writeValue(new File("C:\\Users\\Femila\\eclipse-workspace\\restapi\\src\\main\\java\\com\\qa\\data\\users.json"), users);
		
		//convert the json to json in String
		
		String usersJsonString =  mapper.writeValueAsString(users);
		
		System.out.println("Json String : " + usersJsonString);
		closablehttpResponse = restClient.post(url, usersJsonString, headerPostMap);
		
		//validate response
		
		int postStatusCode = closablehttpResponse.getStatusLine().getStatusCode();
		System.out.println("Post Status Code : " + postStatusCode);
		
		Assert.assertEquals(postStatusCode, TestBase.RESPONSE_STATUS_CODE_201);
		
		//2.Assert Json String
		
		String postresponseString = EntityUtils.toString(closablehttpResponse.getEntity(), "UTF8");
		
		JSONObject postresponseJson = new JSONObject(postresponseString);
		
		System.out.println("Post Response Json from API : " +postresponseJson);
		
		Users userResponse = mapper.readValue(postresponseString, Users.class);
		
		System.out.println(userResponse);
		
//		System.out.println(users.getName().equals(userResponse.getName()));
//		System.out.println(users.getJob().equals(userResponse.getJob()));
//		
		Assert.assertTrue(users.getName().equals(userResponse.getName()));
		
		Assert.assertTrue(users.getName().equals(userResponse.getName()));
		
		System.out.println(userResponse.getId());
		System.out.println(userResponse.getCreatedAt());

		
		
	}


	
	}
	
	
	

