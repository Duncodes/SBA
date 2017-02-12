package io.github.duncodes.sba.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import io.github.duncodes.sba.Uttils.Utils;

/**
 * Created by duncan on 2/4/17.
 */

public class UserLoginHttp {
    public String getUserTokenData(String user){
        HttpURLConnection conn = null;
        InputStream inputStream= null;

        String logindata = "username=Duncan,password:qwerty123";
        try {
            conn =(HttpURLConnection) (new URL(Utils.BASE_URL+"api-token-auth/")).openConnection();
            conn.setRequestMethod("POST");
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
