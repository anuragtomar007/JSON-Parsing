package com.example.anurag.retrofit_jsonparser;

import com.google.gson.annotations.SerializedName;

public class UsersDetails {

    @SerializedName("login")
    private String login;
    @SerializedName("avatar_url")
    private String avatar_url;
    @SerializedName("followers_url")
    private String followers_url;
    @SerializedName("html_url")
    private String html_url;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}
