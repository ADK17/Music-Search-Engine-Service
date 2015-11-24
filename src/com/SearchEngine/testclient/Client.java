package com.SearchEngine.testclient;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;


public class Client {

	public static void main(String args[]) throws IOException,
			InterruptedException {


		String songName = "A Sky Full of Stars";
		HttpClient httpclient = HttpClients.createDefault();
		HttpPost request = new HttpPost(
				"http://localhost:8080/SearchEngineService/webapi/myresource/search");
		
		
		request.addHeader("songName", songName);
		
		
		HttpResponse initialResponse = null;
		try {
			initialResponse = httpclient.execute(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HttpEntity entity = initialResponse.getEntity();
		System.out.println(EntityUtils.toString(entity));

	}
}