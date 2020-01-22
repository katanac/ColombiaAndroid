package com.infotrack.capacitacion.datos.entidades;

import com.google.gson.annotations.SerializedName;

public class PruebaDto {
    @SerializedName("uid") private String uid;
    @SerializedName("email") private String email;
    @SerializedName("password") private String password;
    @SerializedName("username") private String username;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
