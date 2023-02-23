package com.tpo.testdata;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;
public class TestDataGeneration {
	public static String jsonBody()
	{
		JSONObject object=new JSONObject();
		//object.put("username", RandomStringUtils.randomAlphabetic(7));
		object.put("email", "eve.holt@reqres.in");
		object.put("password", "pistol");
		String jsonBody=object.toString();
		return jsonBody;		
	}
}