package com.hib.mappings;
// Generated Dec 30, 2015 2:12:59 PM by Hibernate Tools 3.6.0



/**
 * Userrequests generated by hbm2java
 */
public class Userrequests  implements java.io.Serializable {


     private Integer iduserRequests;
     private User user;
     private Integer userId;
     private String time;
     private boolean acceptance;
     private boolean seen;
     private boolean receiverVisibility;

    public Userrequests() {
    }

	
    public Userrequests(boolean acceptance, boolean seen, boolean receiverVisibility) {
        this.acceptance = acceptance;
        this.seen = seen;
        this.receiverVisibility = receiverVisibility;
    }
    public Userrequests(User user, Integer userId, String time, boolean acceptance, boolean seen, boolean receiverVisibility) {
       this.user = user;
       this.userId = userId;
       this.time = time;
       this.acceptance = acceptance;
       this.seen = seen;
       this.receiverVisibility = receiverVisibility;
    }
   
    public Integer getIduserRequests() {
        return this.iduserRequests;
    }
    
    public void setIduserRequests(Integer iduserRequests) {
        this.iduserRequests = iduserRequests;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public boolean isAcceptance() {
        return this.acceptance;
    }
    
    public void setAcceptance(boolean acceptance) {
        this.acceptance = acceptance;
    }
    public boolean isSeen() {
        return this.seen;
    }
    
    public void setSeen(boolean seen) {
        this.seen = seen;
    }
    public boolean isReceiverVisibility() {
        return this.receiverVisibility;
    }
    
    public void setReceiverVisibility(boolean receiverVisibility) {
        this.receiverVisibility = receiverVisibility;
    }




}


