package io.github.duncodes.sba.Uttils;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by duncan on 2/4/17.
 */

public class Utils {
    public  static  final String BASE_URL = "http://10.42.0.1/api/";

    public static JSONObject getObject(String tagName , JSONObject jsonObject) throws JSONException{
        JSONObject jObject = jsonObject.getJSONObject(tagName);
        return  jObject;
    }

    public static String getString(String tagname ,JSONObject jsonObject) throws  JSONException{
        return jsonObject.getString(tagname);
    }

    public static Float getFloat(String tagname ,JSONObject jsonObject) throws  JSONException{
        return (float) jsonObject.getDouble(tagname);
    }

    public static double getDouble(String tagname ,JSONObject jsonObject) throws  JSONException{
        return (float) jsonObject.getDouble(tagname);
    }

    public static int getInt(String tagname ,JSONObject jsonObject) throws  JSONException{
        return jsonObject.getInt(tagname);
    }

}
