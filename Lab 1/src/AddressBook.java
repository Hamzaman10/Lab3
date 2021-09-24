import java.util.ArrayList;

public class AddressBook
{
    private ArrayList<BuddyInfo> buddy;

    public AddressBook(){
        buddy = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo newBuddy){

        buddy.add(newBuddy);
    }
    public void removeBuddy(BuddyInfo remove){
        buddy.remove(remove);

    }
    private void sayHi(){
        System.out.println("hello");
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613" );
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("This is a change");
        //this was added on github.
    }
}
