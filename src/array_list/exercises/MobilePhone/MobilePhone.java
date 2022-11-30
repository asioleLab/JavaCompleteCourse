package array_list.exercises.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts ;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts=  new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact)>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact contactOld, Contact contactNew){
        int position = findContact(contactOld);
        if(position<0){
            System.out.println(contactOld.getName() + " , was not found.");
            return false;
        }else if(findContact(contactNew.getName()) != -1) {
            System.out.println("Contact with name " + contactNew.getName() +
                    " already exists.  Update was not successful.");
            return false;
        }
        this.myContacts.set(position, contactNew);
        System.out.println(contactOld.getName() + " , was replaced with " + contactNew.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position<0){
            System.out.println(contact.getName() + " , was not found.");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + " , was deleted.");
        return true;
    }

    private int findContact(Contact contactToFind){
       return myContacts.indexOf(contactToFind);
    }

    private int findContact(String contactName){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

//    Same code with filter and optional

/*    public String queryContact(Contact contact){
        Optional<Contact> optionalContact = this.myContacts.stream().filter(el -> el.getName().equals(contact.getName())).findFirst();
        if(optionalContact.isPresent()){
            return optionalContact.get().getName();
        }
        return null;
    }*/

    public void printContacts(){
        System.out.println("Contact List");
        for (int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+"."+ this.myContacts.get(i).getName()
                    + " -> "+ this.myContacts.get(i).getPhoneNumber());
        }
    }
}
