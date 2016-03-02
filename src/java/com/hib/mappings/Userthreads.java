package com.hib.mappings;
// Generated Dec 30, 2015 2:12:59 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Userthreads generated by hbm2java
 */
public class Userthreads  implements java.io.Serializable {


     private Integer iduserThreads;
     private User userByUser2;
     private User userByUser1;
     private String description;
     private Set chatmessageses = new HashSet(0);

    public Userthreads() {
    }

	
    public Userthreads(User userByUser2, User userByUser1) {
        this.userByUser2 = userByUser2;
        this.userByUser1 = userByUser1;
    }
    public Userthreads(User userByUser2, User userByUser1, String description, Set chatmessageses) {
       this.userByUser2 = userByUser2;
       this.userByUser1 = userByUser1;
       this.description = description;
       this.chatmessageses = chatmessageses;
    }
   
    public Integer getIduserThreads() {
        return this.iduserThreads;
    }
    
    public void setIduserThreads(Integer iduserThreads) {
        this.iduserThreads = iduserThreads;
    }
    public User getUserByUser2() {
        return this.userByUser2;
    }
    
    public void setUserByUser2(User userByUser2) {
        this.userByUser2 = userByUser2;
    }
    public User getUserByUser1() {
        return this.userByUser1;
    }
    
    public void setUserByUser1(User userByUser1) {
        this.userByUser1 = userByUser1;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getChatmessageses() {
        return this.chatmessageses;
    }
    
    public void setChatmessageses(Set chatmessageses) {
        this.chatmessageses = chatmessageses;
    }




}

