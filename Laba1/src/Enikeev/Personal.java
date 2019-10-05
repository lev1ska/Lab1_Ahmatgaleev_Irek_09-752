package Enikeev;
import java.util.Date;

public class Personal extends Person{
    private String position;
    private String idnumber;

    public Personal(String lastname, String firstname, String position, Date birthday) {
        super(lastname, firstname, position, birthday);
    }
    
    public String getpost(){
        return position;
    }
    
    public void setpost(String position){
        this.position = position;
    }
    
    public String getIdnumber(){
        return idnumber;
    }
    
    public void setIdnumber(String idnumber){
        this.idnumber = idnumber;
    }
}