package com.example.rest_user.model;

public class CrudeUser {

    private Long id;
    private String name;
    private String adresse;
    private String phone;

    public CrudeUser() {
    }
    public CrudeUser (Long id, String name, String adresse, String phone) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.phone = phone;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    


    
    
}