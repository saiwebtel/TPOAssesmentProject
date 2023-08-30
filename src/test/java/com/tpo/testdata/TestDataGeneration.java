package com.tpo.testdata;
import org.json.JSONException;
import org.json.JSONObject;

import com.tpo.testbase.TestBase;
public class TestDataGeneration extends TestBase {
	public static String jsonBody()
	{
		JSONObject object=new JSONObject();
		try {
			object.put("email", getPropertyData().getProperty("user"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			object.put("password", getPropertyData().getProperty("password"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jsonBody=object.toString();
		return jsonBody;		
	}
}