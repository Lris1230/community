package com.example.community.dto;

/**
 * @Author: Joshua
 * @Date: 07/12/2023 17:59
 */
public class AccessTokenDTO {
    private String client_id;
    private String redirect_id;
    private String login;
    private String state;
    private String code;
    private String cliend_secret;
    private String allow_signup;

    public String getClient_id() {
        return client_id;
    }
    public String getRedirect_id() {
        return redirect_id;
    }
    public String getLogin() {
        return login;
    }
    public String getState() {
        return state;
    }
    public String getAllow_signup() {
        return allow_signup;
    }
    public String getCode(){
        return code;
    }
    public String getCliend_secret() {
        return cliend_secret;
    }

    public void setRedirect_id(String redirect_id) {
        this.redirect_id = redirect_id;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public void setState(String state) {
        this.state = state;
    }


    public void setAllow_signup(String allow_signup) {
        this.allow_signup = allow_signup;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCliend_secret(String client_id) {
        this.cliend_secret = cliend_secret;
    }
}
