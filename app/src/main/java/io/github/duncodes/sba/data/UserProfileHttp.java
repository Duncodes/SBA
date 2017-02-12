package io.github.duncodes.sba.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import io.github.duncodes.sba.Uttils.Utils;

/**
 * Created by duncan on 2/12/17.
 */

public class UserProfileHttp {
    public String getUserData(String user){
        HttpURLConnection conn = null;
        InputStream inputStream= null;

        String logindata = "username=Duncan,password:qwerty123";
        try {
            conn =(HttpURLConnection) (new URL(Utils.BASE_URL+"/users_profile/1")).openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            conn.setDoOutput(true);
            conn.getOutputStream().write(logindata.getBytes());


            // read response
            StringBuffer stringBuffer = new StringBuffer();
            inputStream = conn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while (( line = bufferedReader.readLine()) != null){
                stringBuffer.append(line +"\r\n");
            }
            inputStream.close();
            conn.disconnect();
            return  stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
