package grouppackage;

import java.io.Serializable;
 
public class GroupObject implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private int id;
    private String schedule;
    private String subject;
     
    public GroupObject(){}
    
    public GroupObject(String schedule, String subject){
        this.schedule = schedule;
        this.subject = subject;
    }
    
    public GroupObject(int id, String schedule, String subject){
        this.id = id;
    	this.schedule = schedule;
        this.subject = subject;
    }
     
    public int getId() {
        return id;
    }
     
    public String getSchedule() {
        return schedule;
    }
 
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
 
    public String getSubject() {
        return subject;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }
}