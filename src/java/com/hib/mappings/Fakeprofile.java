package com.hib.mappings;
// Generated Dec 30, 2015 2:12:59 PM by Hibernate Tools 3.6.0



/**
 * Fakeprofile generated by hbm2java
 */
public class Fakeprofile  implements java.io.Serializable {


     private Integer idfakeProfile;
     private Integer userId;
     private String fakeId;
     private String details;
     private String date;

    public Fakeprofile() {
    }

    public Fakeprofile(Integer userId, String fakeId, String details, String date) {
       this.userId = userId;
       this.fakeId = fakeId;
       this.details = details;
       this.date = date;
    }
   
    public Integer getIdfakeProfile() {
        return this.idfakeProfile;
    }
    
    public void setIdfakeProfile(Integer idfakeProfile) {
        this.idfakeProfile = idfakeProfile;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getFakeId() {
        return this.fakeId;
    }
    
    public void setFakeId(String fakeId) {
        this.fakeId = fakeId;
    }
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }




}

