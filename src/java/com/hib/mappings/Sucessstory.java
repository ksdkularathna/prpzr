package com.hib.mappings;
// Generated Dec 30, 2015 2:12:59 PM by Hibernate Tools 3.6.0



/**
 * Sucessstory generated by hbm2java
 */
public class Sucessstory  implements java.io.Serializable {


     private Integer idSucessStory;
     private String topic;
     private Integer userId;
     private String partnerId;
     private String details;
     private String date;

    public Sucessstory() {
    }

    public Sucessstory(String topic, Integer userId, String partnerId, String details, String date) {
       this.topic = topic;
       this.userId = userId;
       this.partnerId = partnerId;
       this.details = details;
       this.date = date;
    }
   
    public Integer getIdSucessStory() {
        return this.idSucessStory;
    }
    
    public void setIdSucessStory(Integer idSucessStory) {
        this.idSucessStory = idSucessStory;
    }
    public String getTopic() {
        return this.topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
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


