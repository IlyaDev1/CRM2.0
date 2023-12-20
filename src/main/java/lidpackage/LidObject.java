package lidpackage;


import java.io.Serializable;
 
public class LidObject implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private int id;
    private String name;
    private int old;
    private String subject;
    
    public LidObject(){}
    
    public LidObject(String name, int old, String subject){
        this.name = name;
        this.old = old;
        this.subject = subject;
    }
    
    public LidObject(int id, String name, int old, String subject){
        this.id = id;
    	this.name = name;
        this.old = old;
        this.subject = subject;
    }
     
    public int getId() {
        return id;
    }
     
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getOld() {
        return old;
    }
 
    public void setOld(int old) {
        this.old = old;
    }
    
    public String getSubject() {
        return subject;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }
}