public class ContactInfo {
    Contact[] myFriends;
    int friendsCount;
    ContactInfo()
    {
        this.friendsCount=0;
        this.myFriends=new Contact[50];
    }
    public  void addContacts(Contact contact)
    {
        myFriends[friendsCount]=contact;
        friendsCount++;
        System.out.println(myFriends);
    }
    public  Contact searchContact(String searchName)
    {
        for(int i=0;i<friendsCount;i++)
        {
            if(myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ContactInfo ci=new ContactInfo();
        Contact c=new Contact();
        Contact c1=new Contact();
        Contact c2=new Contact();
        c.name="Keerthana";
        c.phoneNumber="872398693287593";
        c1.name="Keertha";
        c1.phoneNumber="872398693287593";
        c2.name="parsa";
        c2.phoneNumber="872398693287593";
       ci.addContacts(c);
       ci.addContacts(c1);
       ci.addContacts(c2);
        Contact result=ci.searchContact("parsa");
        System.out.println(result.name);
    }
}
