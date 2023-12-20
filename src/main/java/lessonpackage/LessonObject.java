package lessonpackage;

import java.io.Serializable;
 
public class LessonObject implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private int id;
    private String time;
    private String subject;
    private int group;
    private String category;
     
    public LessonObject(){}
    
    public LessonObject(String time, String subject, int group, String category){
        this.time = time;
        this.subject = subject;
        this.group = group;
        this.category = category;
    }
    
    public LessonObject(int id, String time, String subject, int group, String category){
        this.id = id;
    	this.time = time;
        this.subject = subject;
        this.group = group;
        this.category = category;
    }
     
    public int getId() {
        return id;
    }
     
    public String getTime() {
        return time;
    }
 
    public void setTime(String time) {
        this.time = time;
    }
 
    public String getSubject() {
        return subject;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public int getGroup() {
        return group;
    }
    
    public void setGroup(int group) {
        this.group = group;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
}