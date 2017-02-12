package io.github.duncodes.sba.data;

import org.json.JSONException;
import org.json.JSONObject;

import io.github.duncodes.sba.Model.User;
import io.github.duncodes.sba.Uttils.Utils;

/**
 * Created by duncan on 2/4/17.
 */

public class UserTokenParser {

    public static User getToken(String token){
        User user = new User();
        try {

            JSONObject jsonObject = new JSONObject(token);
            String tokenvalue = Utils.getString("token",jsonObject);
            user.setToken(tokenvalue);
            return user;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
