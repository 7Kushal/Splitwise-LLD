package model;

import java.util.UUID;

public class User {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    private String email;
    private Integer mobile;

    public User(String userID, String name , String email, Integer phone){
        this.name=name;
        this.email=email;
//        userID=UUID.randomUUID().toString();
        this.id=userID;
        this.mobile = phone;
    }

    String getName(String userID){
        return this.name;
    }
}
