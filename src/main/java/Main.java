import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
   //Початок блоку команд для перевірки методу public void saveBulk(List<Contact> list){}
        List<Contact> list=new ArrayList<>(3);

        Contact contact1=new Contact ("Ivan","Petrov","322");
        Contact contact2=new Contact("Vasil","Ivanov","644");
        Contact contact3=new Contact("Bogdan","Pidkova","862");

        list.add(contact1);
        list.add(contact2);
        list.add(contact3);
        System.out.println(list);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        new ContactRepositoryImpl().saveBulk(list);
    // Кінець блоку команд для перевірки методу public void saveBulk(List<Contact> list){}

//******************************************************************************************************

/*    // Початок блоку команд для перевірки методу public void update(Contact contact) {}
    Contact contact=new Contact(119,"Jack","White","989");
    new ContactRepositoryImpl(contact).update(contact);
*/    // Кінець блоку команд для перевірки методу public void update(Contact contact) {}

//*******************************************************************************************************

/*    // Початок блоку команд для перевірки методу public void delete(int id) {}

         new ContactRepositoryImpl().delete(125);

*/    // Кінець блоку команд для перевірки методу public void delete(int id) {}

//*******************************************************************************************************

/*    // Початок блоку команд для перевірки методу public List<Contact> getContacts() {}

        System.out.println(new ContactRepositoryImpl().getContacts());

*/    // Кінець блоку команд для перевірки методу public  List<Contact> getContacts() {}

//*******************************************************************************************************

/*  // Початок блоку команд для перевірки методу public void save(Contact contact) {}
        Contact contact1=new Contact ("Ivan","Petrov","322");
        new ContactRepositoryImpl(contact1).save(contact1);
*/  // Кінець блоку команд для перевірки методу public void save(Contact contact) {}

//*******************************************************************************************************

/*  // Початок блоку команд для перевірки методу public Contact getContactById(int id)}

        System.out.println(new ContactRepositoryImpl().getContactById(120));

*/  // Кінець блоку команд для перевірки методу public Contact getContactById(int id)}

//*******************************************************************************************************
    }
}
