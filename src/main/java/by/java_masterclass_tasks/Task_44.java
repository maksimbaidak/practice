package by.java_masterclass_tasks;

public class Task_44 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("5063191");
        mobilePhone.addNewContact(new Contact("Makar", "4445588"));
        mobilePhone.addNewContact(new Contact("Boris", "1113334"));
        mobilePhone.printContacts();
        System.out.println(mobilePhone.findContact("Makar"));
        System.out.println(mobilePhone.queryContact("Boris"));
    }
}
