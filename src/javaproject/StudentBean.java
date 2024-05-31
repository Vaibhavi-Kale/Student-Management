package javaproject;

/**
 *
 * @author Vaibhavi
 */
public class StudentBean {
    private int id;
    private String name;
    private String email;
    private String dob;
    private byte[] photo;
    
    public StudentBean(int id,String name,String email,String dob,byte[] photo){
        this.id=id;
        this.name=name;
        this.email=email;
        this.dob=dob;
        this.photo=photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }   
    
} 
