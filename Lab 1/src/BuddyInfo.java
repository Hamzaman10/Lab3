public class BuddyInfo {

    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number){
        setDetails(name, address,number);
    }
    public void setDetails(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BuddyInfo person = new BuddyInfo("jack", "main str", "1234");
        System.out.println("hello"+ " " + person.name);
    }
}
