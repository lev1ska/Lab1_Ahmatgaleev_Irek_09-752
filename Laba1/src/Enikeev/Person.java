package Enikeev;
import java.util.Date;
abstract class Person {
    private String lastname;
    private String firstname;
    private Date birthday;
    private String position;

    Person(String lastname,String firstname,String position,Date birthday){
        this.lastname=lastname;
        this.firstname=firstname;
        this.birthday =birthday;
        this.position=position;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getFirstname(){
        return firstname;
    }
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    
    public Date getBirthday(){
        return birthday;
    }
    
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    
    public String getPost(){
        return position;
    }
    
    public void setPost(String position){
        this.position = position;
    }
}

class Position{
    String director;
    String manager;
    String cashier;
    String cleaner;
}