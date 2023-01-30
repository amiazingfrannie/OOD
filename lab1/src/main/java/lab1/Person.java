package lab1;

import lab1.Address;
import lab1.Email;
import lab1.Name;

public class Person {

    private Name name;
    private Email email;
    private Address address;

    public Person (Name name, Email email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName(){ return this.name.getName();}
    public String getEmail(){
        return this.email.getEmail();
    }
    public String getAddress(){
        return this.address.getAddress();
    }

}
