package com.example.community.provider;

import com.alibaba.fastjson.JSONObject;
import com.example.community.dto.AccessTokenDTO;
import com.example.community.dto.GithubUser;
import com.fasterxml.jackson.databind.util.JSONPObject;
import okhttp3.*;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.IOException;

import static com.alibaba.fastjson.JSON.parseObject;

/**
/**
* @Author: Joshua
* @Date: 06/12/2023 21:27

*/
@Component
public class GitProvider {


    public String getAccess(AccessTokenDTO accessTokenDTO) {
       MediaType mediaType = MediaType.get("application/json;charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON.toJSONString(accessTokenDTO),mediaType);
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build(); System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            System.out.println(string);
            response.close();
            return string;
        } catch (IOException e) {
        }
        return null;
    }

    public GithubUser getUser(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token=" + accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser =JSON.parseObject(string, GithubUser.class);
            return githubUser;
        } catch (IOException e) {

        }return null;
    }
}
