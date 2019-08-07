package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {
	
	//1. GET Method without Headers
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
	CloseableHttpClient HttpClient = HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url); //http get request
	CloseableHttpResponse closablehttpResponse = HttpClient.execute(httpget); //hit the get url

	return closablehttpResponse;
	
	
	}
	
	//2. Get EMthod with HEaders
	public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient HttpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url); //http get request
		
		for(Map.Entry<String,String> entry : headerMap.entrySet()) {
			httpget.addHeader(entry.getKey(),entry.getValue());
		}
		
		CloseableHttpResponse closablehttpResponse = HttpClient.execute(httpget); //hit the get url

		return closablehttpResponse;
		
	}
	
	//3. POST Method
	
	public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headerPostMap) throws ClientProtocolException, IOException {
		CloseableHttpClient HttpClient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(url);
		httppost.setEntity(new StringEntity(entityString));
		
		for(Map.Entry<String, String> entry: headerPostMap.entrySet()) {
			httppost.addHeader(entry.getKey(),entry.getValue());
		}
		CloseableHttpResponse closedhttpPostResponse = HttpClient.execute(httppost);
		
		return closedhttpPostResponse;
		
	}
		
}

	


