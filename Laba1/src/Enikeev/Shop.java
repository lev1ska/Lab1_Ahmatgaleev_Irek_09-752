package Enikeev;
import Enikeev.Person;
import java.util.List;

public class Shop {
	Integer CodeFoeSystem;
    String address;
    String PhoneNumber;
    List<Person> personList; 
    List<Personal> personal;
    
    public List<Person> getPeople(){
        return personList;
    }
    public List<Personal> getPersonal(){
        return personal;
    }
    public void addPeople(Person person) {
        if (!personList.contains(person)) {
        	personList.add(person);
        }
    }
} 
